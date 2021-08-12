package com.sith.filmesOnlineSith.model;

import javax.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private String nota;
    @Column
    private String sinopse;

    public Filme() {
    }

    public Filme(String nome, String nota, String sinopse) {
        this.nome = nome;
        this.nota = nota;
        this.sinopse = sinopse;
    }

    public Filme(Long id, String nome, String nota, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.sinopse = sinopse;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
