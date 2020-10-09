package com.assignment

import enums.AmountType

class Ingredient {

    Long id // id of the instance in the database
    String name // Name of the ingredient
    int amount  // Amount required
    AmountType amountType // To choose the type of Amount between Grams, Milliliters etc...


    static belongsTo = [Recipe]

    // Constraint to prevent the use of negative input for the time and the use of incorrect characters for the name
    static constraints = {
        name(matches: "[a-zA-Z\\s]+")
        amount(min:0)
    }
}
