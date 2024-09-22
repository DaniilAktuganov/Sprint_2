package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED_APPLE);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_APPLE);
        Food[] products = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.calculateTotalSum() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.calculateTotalSumWithDiscount() + " руб.");
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки: " + shoppingCart.calculateTotalSumVegetarian() + " руб.");
    }
}