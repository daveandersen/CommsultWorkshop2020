package id.ac.sgu;

import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.text.DecimalFormat;

public class HomeSensor extends Observable{
    private int time;
    private double windSpeed;
    private double temperature;
    private double humidity;
    private boolean night;
    private String window, ac, dehumidifier;

    DecimalFormat df = new DecimalFormat("#.#");

    public HomeSensor(double windSpeed, double temperature, double humidity, boolean night){
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.humidity = humidity;
        this.night = night;
    }

    public void registerObserver(Observer o){
        addObserver(o);
    }

    public void startDetectWeather(){
        Random rand = new Random();
        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true) {
                    setWindSpeed(50 * rand.nextDouble());
                    setHumidity(100 * rand.nextDouble());
                    setTemperature(40 * rand.nextDouble());
                    opencloseWindow(windSpeed);
                    onoffAc(temperature);
                    onoffDehumidifier(humidity);
                    System.out.println("Wind Speed: " + df.format(windSpeed) );
                    System.out.println("Humidity: " + df.format(humidity));
                    System.out.println("Temperature: " + df.format(temperature));

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


    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        setChanged();
        notifyObservers(this);

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(this);
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        setChanged();
        notifyObservers(this);
    }

    public boolean getNight(){
        return night;
    }

    public void setNight(int time, boolean night){

    }

    //New Functions

    public void opencloseWindow(double windspeed) {
        if(windspeed > 25){
            this.window = "Close Window";
        }
        else{
            this.window = "Open Window";
        }

        setChanged();
        notifyObservers(this);
    }

    public String getWindow(){
        return window;
    }

    public void onoffAc(double temperature){
        if(temperature > 25){
            this.ac = "AC ON";
        }
        else{
            this.ac = "AC OFF";
        }

        setChanged();
        notifyObservers(this);
    }

    public String getAC(){
        return ac;
    }

    public void onoffDehumidifier(double humidity){
        if(humidity > 30){
            this.dehumidifier = "Dehumidifier ON";
        }
        else{
            this.dehumidifier = "Dehumidifier OFF";
        }

        setChanged();
        notifyObservers(this);
    }

    public String getDehumidifier() {
        return dehumidifier;
    }
}
