package id.ac.sgu;
import java.util.*;

public class SensorImpl2 {
    private List<Observer> observers = new ArrayList<Observer>();
    private double value;

    public SensorImpl2(){};

    public SensorImpl2(double value) {
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
