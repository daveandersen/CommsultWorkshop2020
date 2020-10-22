package id.ac.sgu;

public class Runner {
    public static void main(String[]args){
        SensorUI s1 = new SensorUI();

        SensorImpl s2 = new SensorImpl(0);
        //TemperatureSensor ts = new TemperatureSensor(0);
        //WindSensor ws = new WindSensor(0);
        //HumiditySensor hs = new HumiditySensor(0);

        //ts.registerObserver(s1);
        //ws.registerObserver(s1);
        //hs.registerObserver(s1);
        s2.registerObserver(s1);
        //s2.startSensor();

    }

}
