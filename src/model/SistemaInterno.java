package model;
public class SistemaInterno {
    private int senha = 2222;
    
    public void autenticar(Autenticavel a) {
        boolean autenticou = a.autenticar(this.senha);

        if (autenticou) {
            System.out.println("Acesso autorizado.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
