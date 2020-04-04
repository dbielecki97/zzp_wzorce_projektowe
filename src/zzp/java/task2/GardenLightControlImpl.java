package zzp.java.task2;

import java.util.logging.Logger;

public class GardenLightControlImpl implements ILightControl {
    private static final Logger LOGGER = Logger.getLogger(GardenLightControlImpl.class.getName());
    private ILightControl decorated;

    public GardenLightControlImpl(ILightControl decorated) {
        this.decorated = decorated;
    }

    @Override
    public void turnOn() {
        LOGGER.info("Ogród");
        decorated.turnOn();
    }

    @Override
    public void turnOff() {
        LOGGER.info("Ogród");
        decorated.turnOff();
    }

    public void turnOn(int val) {
        LOGGER.info("Ogród");
        decorated.turnOn();
        LOGGER.info(String.format("Moc %d %%", 100 - val));
    }
}
