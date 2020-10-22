package Draft2;

public abstract class Observer {
    protected SensorImpl s;
    protected Controller c;
    public abstract void update();
}
