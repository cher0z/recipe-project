package com.renaldorasa.recipeproject.repositories;

import com.renaldorasa.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
