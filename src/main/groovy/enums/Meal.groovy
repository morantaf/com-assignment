package enums

enum Meal {

    LUNCH("Lunch"),
    DINER('Diner'),
    BREAKFAST('Breakfast')

    String name

    Meal(String name) {
        this.name = name
    }

}