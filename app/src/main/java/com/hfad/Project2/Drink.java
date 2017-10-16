package com.hfad.Project2;

/**
 * Created by davidg on 30/04/2017.
 */

public class Drink {
    private String name;
    private String description;

    public static final Drink[] drinks = {
            new Drink("Pepsi",
                    "Description: Refreshing drink with any meal\nPrice: $1.75\nSize: 16 Fl oz"),
            new Drink("Milk",
                    "Description: Straight from the cow\nPrice: $1.50\nSize: 12 Fl oz"),
            new Drink("Orange Juice",
                    "Description: Fresh squeezed from florida oranges\nPrice: $2.00\nSize: 12 Fl oz"),
            new Drink("Bottled Water", "Price: $1.00\nSize: 12 Fl oz")
    };

    private Drink(String name, String description) {
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
