package id.ac.sgu;

import java.util.Observable;

public class WindSensor extends SensorImpl implements Sensor{

    public WindSensor(double windSpeed){
        super(windSpeed);
    }

    @Override
    public String turnOnOff(){
        String result;
        if(super.getValue() > 25){
            //super.setTrigger("Window Closed");
            System.out.println("Window Closed");
            result = "Window Closed";

        }
        else{
            //super.setTrigger("Window Open");
            System.out.println("Window Open");
            result = "Window Open";
        }

        setChanged();
        notifyObservers(this);
        return result;
    }

    @Override
    public void update(Observable obs, Object arg){
        World w = (World)obs;
        setValue(w.getWindSpeed());
        System.out.println("Wind: " + w.getWindSpeed());

    }

}
