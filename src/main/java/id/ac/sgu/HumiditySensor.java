package id.ac.sgu;

import java.util.Observable;

public class HumiditySensor extends SensorImpl implements Sensor{

    public HumiditySensor(double humidity){
        super(humidity);
    }

    @Override
    public String turnOnOff(){
        String result;

        if(super.getValue() > 30){
            //super.setTrigger("Dehumidifier ON");
            System.out.println("Dehumidifier ON");
            result = "Dehumidifier ON";
        }
        else{
            //super.setTrigger("Dehumidifier OFF");
            System.out.println("Dehumidifier OFF");
            result = "Dehumidifier OFF";
        }

        setChanged();
        notifyObservers(this);
        return result;
    }

    @Override
    public void update(Observable obs, Object arg){
        World w = (World)obs;
        setValue(w.getHumidity());
        System.out.println("Humidity: " + w.getHumidity());

    }
}
