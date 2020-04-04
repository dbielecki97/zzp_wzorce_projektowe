package zzp.java.task3.Observer;

import zzp.java.task3.Order;

public interface ISubject {
    void register(IObserver o);
    void notifyObservers(Order order);
}
