package zzp.java.task1;

public class PizzaBase {


    private Sauce sauce;
    private SaucePosition saucePosition;

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setSaucePosition(SaucePosition saucePosition) {
        this.saucePosition = saucePosition;
    }

    @Override
    public String toString() {
        return sauce.toString().concat(" - ").concat(saucePosition.toString());
    }
}
