package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;
import ru.yandex.praktikum.model.constants.Colour;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_APPLE)) {
            return Discount.DISCOUNT_FOR_RED_APPLE;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }
}