package zzp.java.task2;

import java.util.logging.Logger;

public class LightControlImpl implements ILightControl {
    private static final Logger LOGGER = Logger.getLogger(LightControlImpl.class.getName());

    @Override
    public void turnOn() {
        LOGGER.info("Światła zostały włączone.");
    }

    @Override
    public void turnOff() {
        LOGGER.info("Światła zostały wyłączone.");
    }
}
