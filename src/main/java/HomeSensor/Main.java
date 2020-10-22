package HomeSensor;

import HomeSensor.HomeSensor;

public class Main {
    public static void main(String[] args){
        HomeSensorUI w = new HomeSensorUI();

        HomeSensor hs = new HomeSensor(15,20,20);
        hs.registerObserver(w);
        hs.startDetectWeather();
    }
}
