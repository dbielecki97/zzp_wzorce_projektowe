package zzp.java.task2;

import java.util.logging.Logger;

public class HouseControl {
    private static final Logger LOGGER = Logger.getLogger(HouseControl.class.getName());
    private final IDoorControl doorControl = new DoorControlImpl();
    private final ILightControl lightControl = new LightControlImpl();
    private final ITempControl tempControl = new TempControlImpl();

    public void enterTheHouse() {
        LOGGER.info("initiated enterTheHouse");
        tempControl.turnOn();
        tempControl.setConstantTemp(22);
        lightControl.turnOn();
        doorControl.unlock();
        doorControl.open();
        doorControl.close();
        doorControl.lock();
    }

    public void leaveTheHouse() {
        LOGGER.info("initiated leaveTheHouse");
        tempControl.turnOff();
        lightControl.turnOff();
        doorControl.unlock();
        doorControl.open();
        doorControl.close();
        doorControl.lock();
    }
}
