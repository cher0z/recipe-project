package com.renaldorasa.recipeproject.controllers;

import com.renaldorasa.recipeproject.domain.Category;
import com.renaldorasa.recipeproject.domain.UnitOfMeasure;
import com.renaldorasa.recipeproject.repositories.CategoryRepository;
import com.renaldorasa.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("category id is: " + categoryOptional.get().getId());
        System.out.println("unit of measurement id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
