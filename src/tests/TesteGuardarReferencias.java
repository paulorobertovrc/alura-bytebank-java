package tests;

import model.Conta;
import model.ContaCorrente;
import model.GuardarReferencias;

public class TesteGuardarReferencias {
    public static void main(String[] args) {
        GuardarReferencias guardador = new GuardarReferencias();
        
        Conta cc1 = new ContaCorrente(1, 123);
        Conta cc2 = new ContaCorrente(1, 345);

        guardador.adicionar(cc1);
        guardador.adicionar(cc2);

        // guardador.imprimir();
        System.out.println(guardador.getTamanho());
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref);
    }
}
