package Draft2;

import java.util.*;

public class SensorImpl {
    private List<Observer> observers = new ArrayList<Observer>();
    private double value;

    public SensorImpl(){};

    public SensorImpl(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        notifyAllObservers();
    }

    public void attach(Observer observer){
       observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
