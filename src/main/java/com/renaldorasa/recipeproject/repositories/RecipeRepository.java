package com.renaldorasa.recipeproject.repositories;

import com.renaldorasa.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
