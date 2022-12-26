package model;

import java.io.Serializable;

/**
 * Esta classe representa um cliente do Bytebank
 * 
 * @author Paulo
 * @version 0.1
 */
public class Cliente implements Autenticavel, Serializable {
    // private static final long serialVersionUID = 7437384231477043207L;

    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil util;
    
    public Cliente(String nome, String cpf, String profissao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setProfissao(profissao);
    }

    public Cliente() {
        this.util = new AutenticacaoUtil();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
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
