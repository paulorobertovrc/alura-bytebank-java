package model;

public class GuardarContas {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardarContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Conta conta) {
        this.referencias[posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public void imprimir() {
        for (int i = 0; i < posicaoLivre; i++) {
            System.out.println(referencias[i].toString());
        }
    }

    public int getTamanho() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
