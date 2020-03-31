package zzp.java.task2;

public class Task2 {
    public static void main(String[] args) {
        HouseControl houseControl = new HouseControl();

        houseControl.enterTheHouse();
        System.out.println("\n");
        houseControl.leaveTheHouse();
        System.out.println("\n");


        GardenLightControlImpl gardenLightControl = new GardenLightControlImpl(new LightControlImpl());
        gardenLightControl.turnOn(50);
    }
}
