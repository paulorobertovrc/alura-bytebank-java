package model;
public class ControleBonificacao {
    private double somaBonificacao;

    public void registrar(Funcionario f) {
        double bonificacao = f.getBonificacao();
        this.somaBonificacao += bonificacao;
    }

    public double getSomaBonificacao() {
        return somaBonificacao;
    }
}
