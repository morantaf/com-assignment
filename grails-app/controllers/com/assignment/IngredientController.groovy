package com.assignment

class IngredientController {

    IngredientService ingredientService

    static allowedMethods = [save:"POST", edit:["POST", "GET"], addIngredient: "POST"]

    // Action to display a form to create an instance of Ingredient
    def create() {
        respond new Ingredient(params)
    }

    // Action to display the form to edit an ingredient
    def edit(Long id) {
        respond ingredientService.get(id)
    }

    // Action to display one ingredient
    def show(Long id) {
        respond ingredientService.get(id)
    }

    // Action to save a created ingredient
    def save(Ingredient ingredient) {
        ingredientService.save(ingredient)
        redirect(controller:"recipe", action:"index", method:"GET")
    }

    // Action to add an Ingredient to a recipe
    def addIngredient(String id, String name, int amount, String type) {
        ingredientService.createIngredient(id, name, amount, type)
        redirect(controller:"recipe", action:"update", id:params.id)
    }

}
