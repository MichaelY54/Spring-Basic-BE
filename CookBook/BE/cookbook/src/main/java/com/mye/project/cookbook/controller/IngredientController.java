package com.mye.project.cookbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mye.project.cookbook.model.Ingredient;
import com.mye.project.cookbook.repository.IngredientRepository;
import com.mye.project.cookbook.service.IngredientService;

@Controller
@RestController
@RequestMapping("ingredient")
public class IngredientController {
	
	@Autowired
	IngredientService ingService;
	
	ObjectMapper obj = new ObjectMapper();
	
	@GetMapping("/list")
	public ResponseEntity<List<Ingredient>> getIngredients() {
		List<Ingredient> ingredientList = ingService.getAllIngredients();
		return ResponseEntity.ok(ingredientList);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Ingredient ingredient) {
		System.out.println("ING CREATED");
//		try {
//			System.out.println(obj.writeValueAsString(ingredient));			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		ingService.create(ingredient);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Ingredient ingredient) {
		System.out.println("ING UPDATED");
		ingService.update(ingredient);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		System.out.println("ING DELETED");
		ingService.delete(id);
	}
	
}
