package com.mye.project.cookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mye.project.cookbook.model.RecipeDetail;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeDetail, Integer>{

}
