package com.sith.filmesOnlineSith.controller;


import com.sith.filmesOnlineSith.model.*;
import com.sith.filmesOnlineSith.repository.UserRepository;
import com.sith.filmesOnlineSith.repository.FilmeRepository;
import com.sith.filmesOnlineSith.service.FilmeService;
import com.sith.filmesOnlineSith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.management.ValueExp;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
@RequestMapping("")
public class SithController {

    @Autowired
    UserService userService;

    @Autowired
    FilmeService filmeService;


    //metodos get
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome(){
        return "index";
    }

    @RequestMapping(value = "/filmes", method = RequestMethod.GET)
    public String getFilmesPage(){
        return "filmes";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/series", method = RequestMethod.GET)
    public String getSeriesPage(){
        return "series";
    }

    @RequestMapping(value = "/cadastro",method = RequestMethod.GET)
    public String getCadastroPage(){
        return "cadastro";
    }

    @RequestMapping(value = "/gerenciado",method = RequestMethod.GET)
    public String getAdmPage(){
        return "Gerente";
    }

    @RequestMapping(value = "/edicao",method = RequestMethod.GET)
    public String getEdicaoPage(){
        return "Edicao_do_filme";
    }

    @RequestMapping(value = "/busca",method = RequestMethod.GET)
    public String getBuscaPage(){
        return "Busca_Nome";
    }

    @RequestMapping(value = "/adicionar",method = RequestMethod.GET)
    public String getAdicionarPage(){
        return "adicionar";
    }

    //metodos post
    @RequestMapping(value = "/cadastro",method = RequestMethod.POST)
    public String cadastrar(UserCadastro userCadastro){
        userService.save(new User(userCadastro.Nome,userCadastro.usuario, userCadastro.senha));
        System.out.println("Nome:"+userCadastro.getNome());
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(LoginUser loginUser){
        List<User> allUsers = userService.findAll();
        System.out.println(""+loginUser.getUsuario());
        try{
            for(User a: allUsers){
                if(loginUser.getSenha().equals(a.getSenha())
                        && loginUser.getUsuario().equals(a.getUsuario())){
                    return "index";
                }
            }

        }catch (Exception e) {
            return "login";
        }
        return "login";
    }

    @RequestMapping(value = "/adicionar",method = RequestMethod.POST)
    public String adicionar(FilmeCadastro filmeCadastro){
        filmeService.save(new Filme(filmeCadastro.Nome,filmeCadastro.nota, filmeCadastro.sinopse));
        System.out.println("Nome:"+filmeCadastro.getNome());
        return "redirect:/gerenciado";
    }
    @RequestMapping(value = "/busca", method = RequestMethod.POST)
    public String busca(FilmeCadastro filme){
        List<Filme> filmeList = filmeService.findAll();
        System.out.println(""+filme.getNome());
        try{
            for(Filme a: filmeList){
                if(a.getNome().equals(filme.getNome())){

                    return "redirect:/edicao";
                }
            }

        }catch (Exception e) {
            System.out.println(e);
            return "redirect:/busca";
        }

        return "redirect:/busca";
    }

}
