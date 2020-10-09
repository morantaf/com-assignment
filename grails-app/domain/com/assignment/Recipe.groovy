package com.assignment

import enums.Meal

class Recipe {

    Long id // id of the instance in the database
    String name // name of the recipe
    String description // Description of the recipe
    int timeInMinutes // Time required to cook in minutes
    Meal meal // Which meal is best for that recipe

    static hasMany = [ingredients : Ingredient]

    // Add constraint for the timeInMinutes so that it can't go negative
    static constraints = {
        name(matches: "[a-zA-Z\\s]+")
        description(matches: "[a-zA-Z\\s]+")
        timeInMinutes(min:0)
    }
}
