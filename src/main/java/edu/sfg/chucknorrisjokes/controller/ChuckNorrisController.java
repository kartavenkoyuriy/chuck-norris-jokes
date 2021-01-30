package edu.sfg.chucknorrisjokes.controller;

import edu.sfg.chucknorrisjokes.services.ChuckNorrisJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {
    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public ChuckNorrisController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokesService.getJoke());
        return "chucknorris";
    }
}
