package com.assignment

import grails.gorm.transactions.Transactional

@Transactional
class IngredientService {

    def get(id) {
        Ingredient.get(id)
    }

    def save(ingredient) {
        ingredient.save()
    }

    def list() {
        Recipe.list()
    }

    def serviceMethod() {

    }
}
