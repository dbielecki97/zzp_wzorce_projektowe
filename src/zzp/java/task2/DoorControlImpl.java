package zzp.java.task2;


import java.util.logging.Logger;

public class DoorControlImpl implements IDoorControl {
    private static final Logger LOGGER = Logger.getLogger(DoorControlImpl.class.getName());

    @Override
    public void open() {
        LOGGER.info("Drzwi zostały otwarte.");
    }

    @Override
    public void close() {
        LOGGER.info("Drzwi zostały zamknięte.");
    }

    @Override
    public void lock() {
        LOGGER.info("Drzwi zostały zablokowane.");
    }

    @Override
    public void unlock() {
        LOGGER.info("Drzwi zostały odblokowane.");
    }
}
