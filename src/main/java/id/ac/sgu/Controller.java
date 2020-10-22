package id.ac.sgu;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer{
    private TemperatureSensor ts;
    private HumiditySensor hs;
    private WindSensor ws;

    public Controller(){};
    public Controller(TemperatureSensor ts, HumiditySensor hs, WindSensor ws) {
        this.ts = ts;
        this.hs = hs;
        this.ws = ws;
    }

    public void update(Observable obs, Object arg){
        TemperatureSensor ts = (TemperatureSensor)obs;
        WindSensor ws = (WindSensor)obs;
        //HumiditySensor hs = (HumiditySensor)obs;

        System.out.println("Temp Control: " + ts.getValue());
        //System.out.println("Humidity Control: " + hs.getValue());
        System.out.println("Wind Control: " + ws.getValue());
    }
}
