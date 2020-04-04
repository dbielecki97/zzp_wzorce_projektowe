package zzp.java.task2;

import java.util.logging.Logger;

public class HouseCinemaLightControlImpl implements ILightControl {
    private static final Logger LOGGER = Logger.getLogger(HouseCinemaLightControlImpl.class.getName());
    ILightControl decorated;

    public HouseCinemaLightControlImpl(ILightControl decorated) {
        this.decorated = decorated;
    }

    @Override
    public void turnOn() {
        LOGGER.info("House cinema");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("House cinema");
        decorated.turnOff();
    }

    public void setColor(String color) {
        LOGGER.info(String.format("Kolor został ustawiony na %s", color));
    }

    public void turnOnDynamicLighting() {
        LOGGER.info("Włączono dynamiczne oświetlenie");
    }

    public void turnOffDynamicLighting() {
        LOGGER.info("Włączono dynamiczne oświetlenie");
    }
}
