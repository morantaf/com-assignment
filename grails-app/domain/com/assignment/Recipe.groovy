package com.assignment

import enums.Meal

class Recipe {

    String name // name of the recipe
    String description // Description of the recipe
    int timeInMinutes // Time required to cook in minutes
    Meal meal // Which meal is best for that recipe

    static hasMany = [ingredients : Ingredient]

    static constraints = {
    }
}
