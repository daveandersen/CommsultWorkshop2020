package Draft2;

import java.util.Observable;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class WindSensor extends SensorImpl{
    DecimalFormat df = new DecimalFormat("#.#");
    public WindSensor(double windSpeed){
        super(windSpeed);
    }

    public void startRandom(){
        Random rand = new Random();

        setValue(40*rand.nextDouble());
        //System.out.println("Wind Speed: " + df.format(getValue()) + "kmh");
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
                    setValue(50 * rand.nextDouble());
                    System.out.println("Wind Speed: " + df.format(getValue()));

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


    /*
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

     */

    /*
    @Override
    public void update(Observable obs, Object arg){
        World w = (World)obs;
        setValue(w.getWindSpeed());
        System.out.println("Wind: " + w.getWindSpeed());

    }

     */

}
