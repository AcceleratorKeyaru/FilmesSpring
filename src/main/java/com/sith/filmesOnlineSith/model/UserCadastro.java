package com.sith.filmesOnlineSith.model;

public class UserCadastro {

    public String Nome;
    public String usuario;
    public String senha;

    public UserCadastro(String nome, String usuario, String senha) {
        Nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
