package com.vel.SpringWebAppDemo.controllers;

import com.vel.SpringWebAppDemo.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository)
    {
        this.authorRepository=authorRepository;
    }
@RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("author", authorRepository.findAll());
        return "authors/list";
    }


}
