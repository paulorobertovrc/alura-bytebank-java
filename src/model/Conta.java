package model;

import java.io.Serializable;

public abstract class Conta implements Comparable<Conta>, Serializable {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        
        System.out.println("Conta de n. " + this.getNumero() + " criada com sucesso.");
        System.out.println("Total de contas: " + Conta.getTotal());
    }
    
    public Conta(int agencia, int numero, Cliente titular) {
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setTitular(titular);

        System.out.println("Nova conta criada de n. " + this.numero);
        Conta.total++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("[SALDO INSUFICIENTE] Saldo: " + this.saldo + " | " + "Valor solicitado: " + valor);
        }

        this.saldo -= valor;
    }

    public void transferir(Conta contaDestino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int numero) {
        this.agencia = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumero() + " | Agência: " + this.getAgencia();
    }

    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj;

        if (this.agencia == conta.agencia && this.numero == conta.numero) {
            return true;
        }

        return false;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }
}
