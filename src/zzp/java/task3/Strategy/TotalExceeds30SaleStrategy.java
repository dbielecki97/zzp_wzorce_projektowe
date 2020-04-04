package zzp.java.task3.Strategy;

import zzp.java.task3.FoodItem;
import zzp.java.task3.FoodType;
import zzp.java.task3.Order;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Optional;

public class TotalExceeds30SaleStrategy implements ISaleStrategy {
    @Override
    public void makeSale(Order order) {
        if (order.getTotal().compareTo(new BigDecimal(30)) > 0) {
            Optional<FoodItem> soda = order.getFoodItems().stream().filter(foodItem -> foodItem.getType() == FoodType.SODA).min(Comparator.comparing(FoodItem::getPrice));
            soda.ifPresent(foodItem -> foodItem.setPrice(new BigDecimal("0.01")));
        }

    }
}
