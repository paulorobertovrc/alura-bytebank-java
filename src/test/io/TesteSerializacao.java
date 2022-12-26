package test.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;

public class TesteSerializacao {
    public static void main(String[] args) throws Exception{
        Cliente cli = new Cliente("Paulo", "111.222.333-44", "Engenheiro de Software");
        Conta cc = new ContaCorrente(0001, 123);
        cc.setTitular(cli);
        cc.depositar(222.2);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
