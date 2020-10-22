package id.ac.sgu;

public class Runner2 {
    public static void main(String[]args){
        //SensorImpl s = new SensorImpl(0);
        Controller c = new Controller();
        World w = new World();
        TemperatureSensor ts = new TemperatureSensor(0);
        WindSensor ws = new WindSensor(0);
        HumiditySensor hs = new HumiditySensor(0);
        //SensorImpl s = new SensorImpl(0);

        w.startSensor();
        w.registerObserver(ts);
        w.registerObserver(ws);
        w.registerObserver(hs);

        ts.registerObserver(c);
        ws.registerObserver(c);

        //s.registerObserver(c);





    }
}
