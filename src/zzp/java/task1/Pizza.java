package zzp.java.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {
    private final PizzaSize pizzaSize;
    private final PizzaBase base;
    private final List<Extra> extras;

    public Pizza(Builder builder) {
        this.pizzaSize = builder.pizzaSize;
        this.extras = new ArrayList<>(builder.extras);
        this.base = builder.base;
    }

    public static class Builder {
        private final PizzaSize pizzaSize;
        private final List<Extra> extras = new ArrayList<>();
        private final PizzaBase base = new PizzaBase();

        public Builder(PizzaSize pizzaSize, Sauce sauce) {
            this.pizzaSize = pizzaSize;
            this.base.setSauce(sauce);
        }

        public Builder extra(Extra extra) {
            this.extras.add(extra);
            return this;
        }

        public Builder saucePosition(SaucePosition saucePosition) {
            this.base.setSaucePosition(saucePosition);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }


    }

    @Override
    public String toString() {
        return pizzaSize.toString()
                .concat(", " + base.toString() + ", ")
                .concat("extras: " + extras
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors
                                .joining(", ")));
    }
}
