package tests;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteArray {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        /*
        for (int i = 0; i < 5; i++) {
            cc[i] = new ContaCorrente(123, (i * 1200) + 1);
            System.out.println("Conta " + (i + 1) + " : " + cc[i].getAgencia() + " | " + cc[i].getNumero());
            //System.out.println(cc[i].toString());
            System.out.println();
        } 
         */

        ContaCorrente cc1 = new ContaCorrente(123, 1);
        contas[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca(123, 2);
        contas[1] = cp1;

        System.out.println(cc1.toString());
        System.out.println(cp1.toString());
        System.out.println(contas[0].equals(contas[1]));
    }
}
