package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double calculateTotalSum() {
        double totalSum = 0;
        for (Food product : products) {
            totalSum += product.getAmount() * product.getPrice();
        }
        return totalSum;
    }

    public double calculateTotalSumWithDiscount() {
        double totalSumWithDiscount = 0;
        double discount;

        for (Food product : products) {
            discount = product.getDiscount();
            totalSumWithDiscount += (product.getAmount() * product.getPrice()) * ((100 - discount) / 100);
        }
        return totalSumWithDiscount;
    }

    public double calculateTotalSumVegetarian() {
        double totalSumVegetarian = 0;

        for (Food product : products) {
            if (product.isVegetarian()) {
                totalSumVegetarian += product.getAmount() * product.getPrice();
            }
        }
        return totalSumVegetarian;
    }
}