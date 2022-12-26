package model;
public class CriarConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 123);
        
        cc.depositar(100);
        System.out.println("Saldo atual: " + cc.getSaldo());
        
        System.out.println();
        
        try {
            cc.sacar(80);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Saldo atual: " + cc.getSaldo());
        System.out.println();
        System.out.println("FIM DO PROGRAMA");
    }
}
