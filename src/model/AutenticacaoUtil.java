package model;
public class AutenticacaoUtil {
    private int senha;
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            return true;
        }

        return false;
    }
}
