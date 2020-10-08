package com.assignment

import grails.gorm.transactions.Transactional

@Transactional
class RecipeService {

    def get(id) {
        Recipe.get(id)
    }

    def list() {
        Recipe.list()
    }

    def save(recipe) {
        recipe.save()
    }

    def serviceMethod() {

    }
}
