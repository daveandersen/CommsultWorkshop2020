package id.ac.sgu;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;

public class SensorUI implements Observer {
    private JLabel value1;
    private JLabel value2;
    private JLabel value3;
    private JLabel window, ac, dehumidifier;
    DecimalFormat df = new DecimalFormat("#.#");

    public SensorUI(){
        JFrame SensorFrame = new JFrame();

        //Temperature

        JLabel label1 = new JLabel("Temperature: ");
        label1.setBounds(50,40,100,40);
        SensorFrame.add(label1);

        value1 = new JLabel("20 C");
        value1.setBounds(130,40,200,40);
        ac = new JLabel("AC");
        ac.setBounds(200, 40, 200, 40 );

        SensorFrame.add(value1);
        SensorFrame.add(ac);

        //Wind Speed
        JLabel label2 = new JLabel("Wind Speed: ");
        label2.setBounds(50,70,100,40);
        SensorFrame.add(label2);

        value2 = new JLabel("50 kmph");
        value2.setBounds(130,70,200,40);
        window =  new JLabel("Window");
        window.setBounds(200, 70, 200, 40 );
        SensorFrame.add(value2);
        SensorFrame.add(window);

        //Humidity

        JLabel label3 = new JLabel("Humidity: ");
        label3.setBounds(50,100,100,40);
        SensorFrame.add(label3);

        value3 = new JLabel("30 %");
        value3.setBounds(130,100,200,40);
        dehumidifier = new JLabel("Dehumidifier");
        dehumidifier.setBounds(200, 100, 200 ,40);
        SensorFrame.add(value3);
        SensorFrame.add(dehumidifier);

        SensorFrame.setSize(400,400);
        SensorFrame.setLayout(null);
        SensorFrame.setVisible(true);
        SensorFrame.setTitle("Sensor");

    }


    @Override
    public void update(Observable obs, Object arg) {
        System.out.println("Draft2");
        //SensorImpl s = (SensorImpl)obs;
        TemperatureSensor ts = (TemperatureSensor)obs;
        WindSensor ws = (WindSensor)obs;
        HumiditySensor hs = (HumiditySensor)obs;

        value1.setText(df.format(ts.getValue()) + " C");
        value2.setText(df.format(ws.getValue()) + " kmph");
        value3.setText(df.format(hs.getValue()) + "%");
        ac.setText(hs.turnOnOff());
        window.setText(ts.turnOnOff());
        dehumidifier.setText(hs.turnOnOff());

    }

}
