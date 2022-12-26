package model;
public class Administrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil util;

    public Administrador() {
        this.util = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 1000;
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.util.autenticar(senha);
    } 
}
