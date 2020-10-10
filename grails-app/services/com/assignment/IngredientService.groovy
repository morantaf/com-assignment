package com.assignment

import enums.AmountType
import grails.gorm.transactions.Transactional

@Transactional
class IngredientService {


    //Logic to save an ingredient
    def save(ingredient) {
        ingredient.save()
    }

    // Logic to retrieve an ingredient
    def get(id) {
        Ingredient.get(id)
    }

    // Logic to create an ingredient and link it to a recipe
    def createIngredient(String recipeId, String name, int amount, String type){
        def recipe = Recipe.findById(recipeId)
        if(recipe) {
            def ingredient = new Ingredient(name: name, amount: amount, type : type)
            recipe.addToIngredients(ingredient).save()
            return ingredient
        }
    }

}
