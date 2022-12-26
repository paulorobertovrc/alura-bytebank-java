package test.util;

import java.util.ArrayList;

import model.Conta;
import model.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(1, 123);
        Conta cc2 = new ContaCorrente(1, 345);
        Conta cc3 = new ContaCorrente(1, 345);
        lista.add(cc1);
        lista.add(cc2);

        System.out.println(lista.contains(cc3));
    }
}
