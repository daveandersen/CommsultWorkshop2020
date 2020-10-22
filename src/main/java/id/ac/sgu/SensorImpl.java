package id.ac.sgu;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.text.DecimalFormat;

//public abstract class SensorImpl extends Observable implements Sensor {
public class SensorImpl extends Observable implements Observer{
    private double value;
    private String trigger;
    DecimalFormat df = new DecimalFormat("#.#");


    public SensorImpl(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public  void setValue(double value) {
        this.value = value;
        setChanged();
        //System.out.println("hehehe");
        //System.out.println(countObservers());
        notifyObservers();
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public void registerObserver(Observer o){
        System.out.println("haha");
        addObserver(o);
        System.out.println(countObservers());
    }

   /*
    public void startSensor(){
        TemperatureSensor ts = new TemperatureSensor(15);
        WindSensor ws = new WindSensor(15);
        HumiditySensor hs = new HumiditySensor(15);
        Random rand = new Random();

        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true) {
                    ts.setValue(40 * rand.nextDouble());
                    ws.setValue(50 * rand.nextDouble());
                    hs.setValue(100 * rand.nextDouble());

                    System.out.println("Wind Speed: " + df.format(ws.getValue()) );
                    ws.turnOnOff();

                    System.out.println("Humidity: " + df.format(hs.getValue()));
                    hs.turnOnOff();

                    System.out.println("Temperature: " + df.format(ts.getValue()));
                    ts.turnOnOff();

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

    @Override
    public void update(Observable obs, Object arg){ }

    @Override
    public boolean hasChanged() {
        return true; //super.hasChanged();
    }

}
