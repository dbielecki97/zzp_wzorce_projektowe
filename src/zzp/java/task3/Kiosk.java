package zzp.java.task3;


import zzp.java.task3.Command.OrderCommand;
import zzp.java.task3.Observer.IObserver;
import zzp.java.task3.Observer.ISubject;
import zzp.java.task3.Strategy.ISaleStrategy;
import zzp.java.task3.Strategy.NoSaleStrategy;

import java.util.ArrayList;
import java.util.List;

public class Kiosk implements ISubject {
    private List<IObserver> observerList = new ArrayList<>();

    public Kiosk() {
        this.saleStrategy = new NoSaleStrategy();
    }

    private ISaleStrategy saleStrategy;

    public ISaleStrategy getSaleStrategy() {
        return saleStrategy;
    }

    public void setSaleStrategy(ISaleStrategy saleStrategy) {
        this.saleStrategy = saleStrategy;
    }

    public void sendOrder(OrderCommand orderCommand) {
        saleStrategy.makeSale(orderCommand.getOrder());
        orderCommand.execute();
        notifyObservers(orderCommand.getOrder());
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void notifyObservers(Order order) {
        observerList.forEach(observer -> observer.update(order));
    }
}
