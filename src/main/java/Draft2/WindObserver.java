package Draft2;

public class WindObserver extends Observer {

    public WindObserver(SensorImpl s){
        this.s = s;
        this.s.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Wind Speed: " + s.getValue());
    }

}
