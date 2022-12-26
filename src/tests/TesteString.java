package tests;

import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteString {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22, 1);
        ContaPoupanca cp = new ContaPoupanca(22, 2);
        System.out.println(cc);
        System.out.println(cp);
    }
}
