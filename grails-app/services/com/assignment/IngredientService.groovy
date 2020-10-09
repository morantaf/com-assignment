package com.assignment

import grails.gorm.transactions.Transactional
import grails.web.RequestParameter

@Transactional
class IngredientService {

    def get(id) {
        Ingredient.get(id)
    }

    def list(){
        Ingredient.list()
    }

    def save(ingredient) {
        ingredient.save()
    }

}
