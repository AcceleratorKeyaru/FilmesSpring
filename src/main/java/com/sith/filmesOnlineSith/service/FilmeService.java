package com.sith.filmesOnlineSith.service;

import com.sith.filmesOnlineSith.model.Filme;

import java.util.List;

public interface FilmeService {

        public List<Filme> findAll();

        public Filme findById(Long id);

        public Filme save(Filme filme);

        public void delete();
    }


