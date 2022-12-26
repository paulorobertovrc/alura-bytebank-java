package test.util;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteLambda {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(1, 123);
        Cliente cli1 = new Cliente();
        cli1.setNome("Nico");
        cc1.setTitular(cli1);
        cc1.depositar(333);

        Conta cc2 = new ContaPoupanca(1, 345);
        Cliente cli2 = new Cliente();
        cli2.setNome("Paulo");
        cc2.setTitular(cli2);
        cc2.depositar(444);

        Conta cc3 = new ContaCorrente(1, 567);
        Cliente cli3 = new Cliente();
        cli3.setNome("Roberto");
        cc3.setTitular(cli3);
        cc3.depositar(111);

        Conta cc4 = new ContaPoupanca(1, 789);
        Cliente cli4 = new Cliente();
        cli4.setNome("Adriana");
        cc4.setTitular(cli4);
        cc4.depositar(222);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc4);
        lista.add(cc3);
        lista.add(cc2);
        lista.add(cc1);

        lista.forEach((conta) -> System.out.println(conta.getTitular().getNome()));
        
        System.out.println();

        // lista.sort(
        //     (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero())
        // );

        lista.sort((Conta c1, Conta c2) -> {
                String titularC1 = c1.getTitular().getNome();
                String titularC2 = c2.getTitular().getNome();
        
                return titularC1.compareTo(titularC2);
            }
        );
        
        lista.forEach((conta) -> System.out.println(conta.getTitular().getNome()));
    }
}
