package zzp.java.task3;

import zzp.java.task2.HouseCinemaLightControlImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Order {
    private static final Logger LOGGER = Logger.getLogger(HouseCinemaLightControlImpl.class.getName());


    private List<FoodItem> foodItems;

    public Order() {
        super();
        foodItems = new ArrayList<>();
    }

    public Order(Order order) {
        foodItems = new ArrayList<>();
        order.getFoodItems().forEach(foodItem -> foodItems.add(new FoodItem(foodItem)));
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void addFoodItem(FoodItem foodItem) {
        this.foodItems.add(new FoodItem(foodItem));
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public void orderItems() {
        LOGGER.info("ORDER");
        foodItems.forEach(foodItem -> LOGGER.info("Ordered " + foodItem));
    }

    public BigDecimal getTotal() {
        return getFoodItems().stream().map(FoodItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        return "ORDER\n" + foodItems.stream().map(FoodItem::toString).collect(Collectors
                .joining("\n"));
    }
}
