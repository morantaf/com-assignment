package com.assignment

import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->

        JSON.registerObjectMarshaller(Recipe) {
            Recipe recipe ->
                return [
                        name: recipe.name,
                        description: recipe.description,
                        meal: recipe.meal.name,
                        ingredients: recipe.ingredients.collect {it.name},
                        timeToCook: recipe.timeInMinutes
                ]
        }
    }
}
