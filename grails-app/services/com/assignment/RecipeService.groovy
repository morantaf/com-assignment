package com.assignment

import grails.gorm.transactions.Transactional

@Transactional
class RecipeService {

    // Retrieve a Recipe
    def get(id) {
        Recipe.get(id)
    }

    // Retrieve the list of recipes
    def list() {
        Recipe.list()
    }

    // Save the recipe
    def save(recipe) {
        recipe.save()
    }

    // Search a Recipe by its name
    def search(String query) {

        List<Recipe> listOfRecipes = Recipe.list()
        def searchedRecipes = []

        // Loop through the list of recipes
        for(recipe in listOfRecipes) {
            // Test if the name of the recipe contains or is equal to the query. If so, push the recipe to the list
            if(recipe.name.equalsIgnoreCase(query) || recipe.name.contains(query)) {
                searchedRecipes << recipe
            }
        }
        return searchedRecipes

    }
}
