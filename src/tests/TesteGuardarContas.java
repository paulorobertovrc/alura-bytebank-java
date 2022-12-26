package tests;

import model.Conta;
import model.ContaCorrente;
import model.GuardarContas;

public class TesteGuardarContas {
    public static void main(String[] args) {
        GuardarContas guardador = new GuardarContas();
        
        Conta cc1 = new ContaCorrente(1, 123);
        Conta cc2 = new ContaCorrente(1, 345);

        guardador.adicionar(cc1);
        guardador.adicionar(cc2);

        // guardador.imprimir();
        System.out.println(guardador.getTamanho());
        Conta ref = guardador.getReferencia(2);
        System.out.println(ref);
    }
}
