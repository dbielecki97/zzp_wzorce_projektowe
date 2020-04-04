package zzp.java.task3.Strategy;

import zzp.java.task3.FoodItem;
import zzp.java.task3.Order;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class TwoOfAKindSaleStrategy implements ISaleStrategy {
    @Override
    public void makeSale(Order order) {
        List<FoodItem> foodItems = order.getFoodItems();
        foodItems.stream()
                .map(FoodItem::getType)
                .distinct()
                .forEach(kind -> {
                    Optional<BigDecimal> bigDecimalOptional = foodItems.stream()
                            .filter(foodItem -> foodItem.getType() == kind)
                            .map(FoodItem::getPrice)
                            .min(BigDecimal::compareTo);
                    BigDecimal bigDecimal = null;
                    if (bigDecimalOptional.isPresent()) {
                        bigDecimal = bigDecimalOptional.get();
                    }
                    if (foodItems
                            .stream()
                            .filter(foodItem -> foodItem.getType() == kind)
                            .count() >= 2) {
                        BigDecimal finalBigDecimal = bigDecimal;
                        foodItems.stream()
                                .filter(foodItem -> foodItem.getType() == kind)
                                .filter(foodItem -> foodItem.getPrice().equals(finalBigDecimal))
                                .forEach(foodItem -> foodItem.setPrice(foodItem.getPrice().multiply(new BigDecimal("0.9"))));
                    }
                });
    }
}
