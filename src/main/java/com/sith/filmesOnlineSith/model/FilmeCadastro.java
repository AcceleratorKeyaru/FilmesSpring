package com.sith.filmesOnlineSith.model;

public class FilmeCadastro {

        public String Nome;
        public String nota;
        public String sinopse;
        public String novonome;


        public FilmeCadastro(String nome, String nota, String sinopse) {
            Nome = nome;
            this.nota = nota;
            this.sinopse = sinopse;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String nome) {
            Nome = nome;
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

        public String getNovonome() {
            return novonome;
        }

        public void setNovonome(String novonome) {
            this.novonome = novonome;
        }
}