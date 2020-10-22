package Draft2;

import java.text.DecimalFormat;

public class Controller{

    public Controller(){
        Controller();
    }

    public void Controller() {
        String ac, dehumidifier, window;
        SensorImpl s = new SensorImpl();
        DecimalFormat df = new DecimalFormat("#.#");

        TemperatureSensor t = new TemperatureSensor(0);
        WindSensor w = new WindSensor(0);
        HumiditySensor h = new HumiditySensor(0);

        TemperatureObserver ts = new TemperatureObserver(s);
        WindObserver ws = new WindObserver(s);
        HumidityObserver hs = new HumidityObserver(s);

        TemperatureActor ta = new TemperatureActor();
        WindActor wa = new WindActor();
        HumidityActor ha = new HumidityActor();

        System.out.println("< Home Sensor >");
        while (true) {
            t.startRandom();
            w.startRandom();
            h.startRandom();

            ac = ta.turnOffAc();
            window = wa.closeWindow();
            dehumidifier = ha.turnOff();

            if (t.getValue() > 30) {
                ac = ta.turnOnAc();
            }

            if (w.getValue() < 40) {
                window = wa.openWindow();
            }

            if (h.getValue() > 50) {
                dehumidifier = ha.turnOn();
            }

            System.out.printf("%-20s","Temperature: ");
            System.out.printf("%-15s", df.format(t.getValue()) + "C");
            System.out.printf(ac + "\n");
            System.out.printf("%-20s","Humidity: ");
            System.out.printf("%-15s", df.format(h.getValue()) + "%");
            System.out.printf(dehumidifier + "\n");
            System.out.printf("%-20s","Wind Speed: ");
            System.out.printf("%-15s", df.format(w.getValue()) + "kmh");
            System.out.printf(window + "\n---------------\n");
        }

    }
}
