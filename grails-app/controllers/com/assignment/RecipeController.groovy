package com.assignment

class RecipeController {

    RecipeService recipeService

    static allowedMethods = [save: "POST", update: ["PUT","GET", 'POST'], delete: "DELETE"]

    // Action to display a list of Recipe
    def index() {
        respond recipeService.list()
    }

    // Action to display the details of one recipe
    def show(Long id) {
        respond recipeService.get(id)
    }

    // Action to display the form to create a new instance of Recipe
    def create() {
        respond new Recipe(params)
    }

    // Action to save the instance of recipe created or updated
    def save(Recipe recipe) {
        recipeService.save(recipe)
        redirect action:"index", method:"GET"
    }

    // Action to display the form to update an instance of Recipe
    def update(Long id) {
        respond recipeService.get(id)

    }


}
