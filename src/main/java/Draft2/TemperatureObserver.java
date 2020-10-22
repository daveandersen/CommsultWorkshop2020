package Draft2;

public class TemperatureObserver extends Observer {

    public TemperatureObserver(SensorImpl s){
        this.s = s;
        this.s.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Temperature: " + s.getValue());
    }

}
