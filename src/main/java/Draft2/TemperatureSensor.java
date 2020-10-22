package Draft2;

import java.util.Observable;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;


public class TemperatureSensor extends SensorImpl {
    DecimalFormat df = new DecimalFormat("#.#");
    public TemperatureSensor(double temperature) { super(temperature); }

    public void startRandom(){
        Random rand = new Random();

        setValue(40*rand.nextDouble());
        //System.out.println("Temperature: " + df.format(getValue())+ "C");
        try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*public void startSensor(){
        Random rand = new Random();
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true) {
                    setValue(40 * rand.nextDouble());
                    System.out.println("Temperature: " + df.format(getValue()));

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
*/





    /*
    @Override
    public String turnOnOff() {
        String result;
        if (super.getValue() > 25) {
            //super.setTrigger("AC ON");
            System.out.println("AC ON");
            result = "AC ON";
        } else {
            //super.setTrigger("AC OFF");
            System.out.println("AC OFF");
            result = "AC OFF";
        }
        setChanged();
        notifyObservers(this);
        return result;
    }

     */

    /*
    @Override
    public void update(Observable obs, Object arg) {
        World w = (World) obs;
        setValue(w.getTemperature());
        System.out.println("Temperature: " + w.getTemperature() + "\n");
    }

     */
}