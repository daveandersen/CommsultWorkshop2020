package Draft2;

public class HumidityObserver extends Observer {

    public HumidityObserver(SensorImpl s){
        this.s = s;
        this.s.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Humidity: " + s.getValue());
    }

}
