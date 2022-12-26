package test.util;

import model.Conta;
import model.ContaCorrente;

public class Teste2 {
    public static void main(String[] args) {
        Conta[] referencias = new Conta[5];
        referencias[0] = new ContaCorrente(22, 11);
        referencias[1] = new ContaCorrente(22, 22);

        Conta ref = referencias[0];

        System.out.println(referencias);
        System.out.println(referencias[0]);
        System.out.println(ref);
    } 
}
