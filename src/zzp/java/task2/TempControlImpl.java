package zzp.java.task2;

import java.util.logging.Logger;

public class TempControlImpl implements ITempControl {
    private static final Logger LOGGER = Logger.getLogger(TempControlImpl.class.getName());

    @Override
    public void turnOff() {
        LOGGER.info("Kontrola temperatury została wyłączona.");
    }

    @Override
    public void turnOn() {
        LOGGER.info("Kontrola temperatury została włączona.");
    }

    @Override
    public void setConstantTemp(int temp) {
        LOGGER.info(String.format("Ustawiono temperaturę na %d stopci Celsjusza.", temp));
    }
}
