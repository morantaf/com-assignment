package com.assignment

import grails.gorm.transactions.Transactional
import grails.web.RequestParameter

@Transactional
class IngredientService {


    //Logic to save an ingredient
    def save(ingredient) {
        ingredient.save()
    }

}
