package com.hfad.Project2;

public class Food {
    private String name;
    private String description;

    public static final Food[] foods = {
            new Food("Sirloin Steak",
                    "Description: A 12 oz sirloin that will make any mouth water\nPrice: $18.00"),
            new Food("Fried Chicken",
                    "Description: Four pieces of our famous buttermilk fried chicken\nPrice: $12.50"),
            new Food("6-inch personal pizza",
                    "Description: Create your own 6-inch personal pizza with whatever toppings you please\n" +
                            "Price: 1-topping: 8.99 each topping after additional $1.00"),
            new Food("Lasagna",
                    "Description: Our world famous homemade lasagna\n Price: $11.00")
    };

    private Food(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
