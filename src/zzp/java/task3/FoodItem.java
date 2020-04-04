package zzp.java.task3;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FoodItem {
    private BigDecimal price;
    private String name;
    private FoodType type;

    public FoodItem(String name, FoodType type, BigDecimal price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public FoodItem(FoodItem foodItem) {
        this.name = foodItem.name;
        this.type = foodItem.type;
        this.price = foodItem.price;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%s - %szł", name, df.format(price));
    }
}
