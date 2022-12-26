package model;
public class Gerente extends Funcionario implements Autenticavel {    
    private AutenticacaoUtil util;

    public Gerente() {
        this.util = new AutenticacaoUtil();
    }
    
    public double getBonificacao() {
        return super.getSalario();
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
 