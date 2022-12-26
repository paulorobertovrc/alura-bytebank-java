package tests;
import model.CalculadoraImposto;
import model.ContaCorrente;
import model.SeguroVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 123);
        cc.depositar(100);

        SeguroVida sv = new SeguroVida();

        CalculadoraImposto calc = new CalculadoraImposto();
        calc.registrar(cc);
        calc.registrar(sv);
        System.out.println(calc.getTotalImposto());
    }
}
