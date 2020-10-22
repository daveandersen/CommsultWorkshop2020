package Draft2;

import java.util.Observable;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class HumiditySensor extends SensorImpl {
    DecimalFormat df = new DecimalFormat("#.#");

    public HumiditySensor(double windSpeed) {
        super(windSpeed);
    }

    public void startRandom(){
        Random rand = new Random();

        setValue(100*rand.nextDouble());
        //System.out.println("Humidity: " + df.format(getValue()) + "%\n");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*public void startSensor() {
        Random rand = new Random();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    setValue(50 * rand.nextDouble());
                    System.out.println("Humidity: " + df.format(getValue()));

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }*/

}