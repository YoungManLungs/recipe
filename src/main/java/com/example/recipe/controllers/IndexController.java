package com.example.recipe.controllers;

import com.example.recipe.repositories.CategoryRepository;
import com.example.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("He pinged me kramer, he pinged me, I can believe he pinged me!");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
