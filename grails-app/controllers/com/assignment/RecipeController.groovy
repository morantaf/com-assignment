package com.assignment

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RecipeController {

    RecipeService recipeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        respond recipeService.list()
    }

    def show(Long id) {
        respond recipeService.get(id)
    }

    def create() {
        respond new Recipe(params)
    }

    def save(Recipe recipe) {
        recipeService.save(recipe)
        redirect action:"index", method:"GET"
    }

    def update(Long id) {
        respond recipeService.get(id)
    }


}
