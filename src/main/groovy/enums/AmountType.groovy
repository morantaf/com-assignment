package enums

enum AmountType {
    GRAMS('Grams'),
    TEASPOONS('Teaspoon'),
    MILLILITERS('Milliliters'),
    PIECES('Pieces')

    String name

    AmountType(String name) {
        this.name = name
    }
}