package com.sith.filmesOnlineSith.controller;


import com.sith.filmesOnlineSith.model.LoginUser;
import com.sith.filmesOnlineSith.model.User;
import com.sith.filmesOnlineSith.model.UserCadastro;
import com.sith.filmesOnlineSith.repository.UserRepository;
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

    @RequestMapping(value = "/perfil",method = RequestMethod.GET)
    public String getPerfilPage(){
        return "Perfil";
    }

    @RequestMapping(value = "/edicao",method = RequestMethod.GET)
    public String getEdicaoPage(){
        return "Edicao_do_perfil";
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

}
