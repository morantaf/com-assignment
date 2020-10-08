package com.assignment

class Recipe {

    String name // name of the recipe
    String description // Description of the recipe
    int timeInMinutes // Time to cook
    static ArrayList<String> meal = ["Breakfast","Lunch","Dinner"]
    ArrayList<Ingredient> ingredients

    static constraints = {
    }
}
