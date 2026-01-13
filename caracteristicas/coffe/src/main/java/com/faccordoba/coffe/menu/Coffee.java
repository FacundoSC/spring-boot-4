package com.faccordoba.coffe.menu;

import org.jspecify.annotations.Nullable;

public class Coffee {
    private final String type;
    private final double price;
    @Nullable final private String description;

    public Coffee(String type, double price, @Nullable String description) {
        this.type = type; // type cannot be null
        this.price = price; // price cannot be null
        this.description = description; // description can be null
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public @Nullable String getDescription() {
        return description;
    }
}
