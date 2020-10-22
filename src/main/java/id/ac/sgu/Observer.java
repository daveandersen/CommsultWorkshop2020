package id.ac.sgu;


import Draft2.SensorImpl;

public abstract class Observer {
    protected SensorImpl s;
    public abstract void update();
}
