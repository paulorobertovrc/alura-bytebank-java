package tests;
import model.ControleBonificacao;
import model.Designer;
import model.EditorDeVideo;
import model.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Paulo");
        g1.setSalario(5000);

        Designer d = new Designer();
        d.setSalario(2000);

        EditorDeVideo ev = new EditorDeVideo();
        ev.setSalario(3000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registrar(g1);
        controle.registrar(d);
        controle.registrar(ev);

        System.out.println(g1.getBonificacao());
        System.out.println(d.getBonificacao());
        System.out.println(ev.getBonificacao());
        System.out.println(controle.getSomaBonificacao());
     }
}
