package model;
public class CalculadoraImposto {
    private double totalImposto = 0;
    
    public void registrar(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
