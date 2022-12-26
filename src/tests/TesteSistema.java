package tests;
import model.Administrador;
import model.Cliente;
import model.Gerente;
import model.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Cliente c = new Cliente();
        c.setSenha(2222);

        Administrador a = new Administrador();
        a.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autenticar(g);
        si.autenticar(c);
        si.autenticar(a);

        // System.out.println(g.autenticar(g.getSenha()));
        // System.out.println(c.autenticar(1234));
        // System.out.println(a.autenticar(2222));
    }
}
