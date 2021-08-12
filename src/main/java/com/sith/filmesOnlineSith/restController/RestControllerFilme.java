package com.sith.filmesOnlineSith.restController;
import com.sith.filmesOnlineSith.model.Filme;
import com.sith.filmesOnlineSith.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class RestControllerFilme {

    @Autowired
    FilmeService filmeService;

    @GetMapping("/filmes")
    public List<Filme> getAll(){
        return filmeService.findAll();
    }

    @PostMapping("/filmes")
    public Filme saveFilme(@RequestBody Filme filme){
        System.out.println(filme.getNome());
        return filmeService.save(filme);
    }

}
