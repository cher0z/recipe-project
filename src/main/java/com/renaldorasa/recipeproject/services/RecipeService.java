package com.renaldorasa.recipeproject.services;

import com.renaldorasa.recipeproject.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}