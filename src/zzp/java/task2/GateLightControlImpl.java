package zzp.java.task2;

import java.util.logging.Logger;

public class GateLightControlImpl implements ILightControl {
    private static final Logger LOGGER = Logger.getLogger(GardenLightControlImpl.class.getName());
    ILightControl decorated;

    public GateLightControlImpl(ILightControl decorated) {
        this.decorated = decorated;
    }

    @Override
    public void turnOn() {
        LOGGER.info("Gate");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("Gate");
        decorated.turnOff();
    }
}
