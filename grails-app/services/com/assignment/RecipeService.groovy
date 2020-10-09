package com.assignment

import grails.gorm.transactions.Transactional

@Transactional
class RecipeService {

    // Logic to retrieve a Recipe
    def get(id) {
        Recipe.get(id)
    }

    // Logic to retrieve the list of recipes
    def list() {
        Recipe.list()
    }

    // Logic to save the recipe
    def save(recipe) {
        recipe.save()
    }

}
