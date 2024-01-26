package com.mye.project.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mye.project.cookbook.model.Ingredient;
import com.mye.project.cookbook.repository.IngredientRepository;

@Service
public class IngredientService {
	@Autowired
	private IngredientRepository ingredientRepo;
	
	public List<Ingredient> getAllIngredients(){
		return ingredientRepo.findAll();
	}
	
	public void updateIngredient(Ingredient updateIng) {
		ingredientRepo.save(updateIng);
	}
	
	public void create(Ingredient ingredient) {
		ingredientRepo.save(ingredient);
	}
	
	public void update(Ingredient ingredient) {
		ingredientRepo.save(ingredient);
	}
	
	public void delete(Integer id) {
		ingredientRepo.deleteById(id);
	}
}
