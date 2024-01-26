package com.mye.project.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mye.project.cookbook.model.Ingredient;

@Repository
public interface RecipeDetailRepository extends JpaRepository<Ingredient, Integer>{

}
