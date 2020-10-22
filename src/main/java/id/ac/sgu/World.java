package id.ac.sgu;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.text.DecimalFormat;

public class World extends Observable {
    double ts, ws, hs;
    DecimalFormat df = new DecimalFormat("#.#");

    public void registerObserver(Observer o){
        addObserver(o);
        System.out.println(countObservers());
    }

    public void startSensor(){
        Random rand = new Random();

        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true) {

                    setTemperature(40 * rand.nextDouble());
                    setWindSpeed(50 * rand.nextDouble());
                    setHumidity(100 * rand.nextDouble());

                    //System.out.println("Wind Speed: " + df.format(getWindSpeed()));
                    //ws.turnOnOff();

                    //System.out.println("Humidity: " + df.format(hs));
                    //hs.turnOnOff();

                    //System.out.println("Temperature: " + df.format(getTemperature()));
                    //ts.turnOnOff();
                    setChanged();
                    notifyObservers();


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

    public void setTemperature (double t){
        this.ts = t;
    }

    public double getTemperature(){
        return ts;
    }

    public void setWindSpeed(double ws){
        this.ws = ws;
    }

    public double getWindSpeed(){
        return ws;
    }

    public void setHumidity(double hs){
        this.hs = hs;
    }

    public double getHumidity(){
        return hs;
    }

}


