package zzp.java.task3;

import zzp.java.task2.HouseCinemaLightControlImpl;
import zzp.java.task3.Observer.IObserver;

import java.util.logging.Logger;

public class Kitchen implements IObserver {
    private static final Logger LOGGER = Logger.getLogger(HouseCinemaLightControlImpl.class.getName());

    @Override
    public void update(Order order) {
        LOGGER.info(order.toString());
    }
}
