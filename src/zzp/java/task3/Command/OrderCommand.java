package zzp.java.task3.Command;

import zzp.java.task2.HouseCinemaLightControlImpl;
import zzp.java.task3.Order;

import java.util.logging.Logger;

public class OrderCommand implements ICommand {
    private Order order;
    private static final Logger LOGGER = Logger.getLogger(HouseCinemaLightControlImpl.class.getName());

    public OrderCommand(Order order) {
        super();
        this.order = order;
    }

    @Override
    public void execute() {
        LOGGER.info("Ordering...");
        order.orderItems();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
