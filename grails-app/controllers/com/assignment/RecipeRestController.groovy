package com.assignment

import grails.converters.*

class RecipeRestController {
    static responseFormats = ["json"]

    def recipeService

    def search() {

        def searchedRecipes = recipeService.search(params.name)

        if(!searchedRecipes) {
            render(status: 404, text:"No recipe found")
        }
        render searchedRecipes as JSON
    }
}
