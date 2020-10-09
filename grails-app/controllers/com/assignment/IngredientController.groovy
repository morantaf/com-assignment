package com.assignment

class IngredientController {

    IngredientService ingredientService

    static allowedMethods = [save:"POST"]

    // Action to display a form to create an instance of Ingredient
    def create() {
        respond new Ingredient(params)
    }

    // Action to save a created ingredient
    def save(Ingredient ingredient) {
        ingredientService.save(ingredient)
        redirect(controller:"recipe", action:"index", method:"GET")
    }

}
