package com.assignment

import enums.AmountType

class Ingredient {

    String name // Name of the ingredient
    AmountType amount  // Amount required


    static belongsTo = [Recipe]

    static constraints = {
    }
}
