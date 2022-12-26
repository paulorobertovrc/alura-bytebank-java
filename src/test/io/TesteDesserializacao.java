package test.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Conta;
import model.ContaCorrente;

public class TesteDesserializacao {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        Conta conta = (ContaCorrente) ois.readObject();
        System.out.println(conta);
        System.out.println(conta.getTitular().getNome());
        ois.close();
    }
}
