package com.assignment

class Ingredient {

    String name

    static hasMany = [recipes : Recipe]

    static constraints = {
    }
}
