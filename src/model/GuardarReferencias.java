package model;

public class GuardarReferencias {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardarReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Object referencia) {
        this.referencias[posicaoLivre] = referencia;
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

    public Object getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
