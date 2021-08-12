package com.sith.filmesOnlineSith.service.serviceImpl;

import com.sith.filmesOnlineSith.model.Filme;
import com.sith.filmesOnlineSith.repository.FilmeRepository;
import com.sith.filmesOnlineSith.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmeServiceImpl implements FilmeService{

    @Autowired
    FilmeRepository filmeRepository;

    @Override
    public List<Filme> findAll() {
        return filmeRepository.findAll();
    }

    @Override
    public Filme findById(Long id) {
        return filmeRepository.findById(id).get();
    }

    @Override
    public Filme save(Filme filme) {

        Filme saved = filmeRepository.save(filme);
        System.out.println(saved.getId());
        return saved;

    }


}
