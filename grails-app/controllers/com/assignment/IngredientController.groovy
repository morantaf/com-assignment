package com.assignment

class IngredientController {

    IngredientService ingredientService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]


    def show(Long id) {
        respond ingredientService.get(id)
    }

    def create() {
        respond new Ingredient(params)
    /*def recipe = Recipe.findById(params.id)
        if(recipe) {
            def ingredient = new Ingredient(params)
            recipe.addToIngredients(ingredient)
        }
        redirect(controller:'recipe' , action: 'create', id: params.id)*/
    }

    def addIngredient() {
        def recipe = Recipe.findById(params.id)
        if(recipe) {
            def ingredient = new Ingredient(params)
            recipe.addToIngredients(ingredient)
        }
        redirect(controller:'recipe' , action: 'create', id: params.id)
    }

    def edit(Long id) {
        respond ingredientService.get(id)
    }


}
