package zzp.java.task3;


import zzp.java.task3.Command.OrderCommand;
import zzp.java.task3.Strategy.TotalExceeds30SaleStrategy;
import zzp.java.task3.Strategy.TwoOfAKindSaleStrategy;

import java.math.BigDecimal;

public class Task3 {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        Kitchen kitchen = new Kitchen();

        kiosk.register(kitchen);
        Order order = new Order();
        FoodItem cola = new FoodItem("cola", FoodType.SODA, new BigDecimal(2));
        FoodItem pepsi = new FoodItem("pepsi", FoodType.SODA, new BigDecimal(3));
        FoodItem pepperoni = new FoodItem("pepperoni", FoodType.PIZZA, new BigDecimal(34));
        FoodItem salami = new FoodItem("salami", FoodType.PIZZA, new BigDecimal(35));

        order.addFoodItem(cola);
        order.addFoodItem(cola);
        order.addFoodItem(pepsi);
        order.addFoodItem(pepsi);
        order.addFoodItem(pepperoni);
        order.addFoodItem(pepperoni);
        order.addFoodItem(salami);
        kiosk.setSaleStrategy(new TwoOfAKindSaleStrategy());
        Order order2 = new Order(order);
        kiosk.sendOrder(new OrderCommand(order));
        kiosk.setSaleStrategy(new TotalExceeds30SaleStrategy());
        kiosk.sendOrder(new OrderCommand(order2));
    }
}
