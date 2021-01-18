package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public abstract void setState(String s);
    public abstract String getState();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }
}
