package com.mye.project.cookbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe_detail")
public class RecipeDetail {
	@Id @GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="recipe_id")
	private Integer recipeId;
	
	@Column(name="ingredients_list")
	private String ingredientsList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	public String getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(String ingredientsList) {
		this.ingredientsList = ingredientsList;
	}

}
