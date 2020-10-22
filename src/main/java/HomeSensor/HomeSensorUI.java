package HomeSensor;

import HomeSensor.HomeSensor;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;

public class HomeSensorUI implements Observer {
    private JLabel value1;
    private JLabel value2;
    private JLabel value3;
    private JLabel window, ac, dehumidifier;
    DecimalFormat df = new DecimalFormat("#.#");

    public HomeSensorUI(){
        JFrame HomeSensorFrame = new JFrame();

        //Temperature

        JLabel label1 = new JLabel("Temperature: ");
        label1.setBounds(50,40,100,40);
        HomeSensorFrame.add(label1);

        value1 = new JLabel("20 C");
        value1.setBounds(130,40,200,40);
        ac = new JLabel("AC");
        ac.setBounds(200, 40, 200, 40 );

        HomeSensorFrame.add(value1);
        HomeSensorFrame.add(ac);

        //Wind Speed
        JLabel label2 = new JLabel("Wind Speed: ");
        label2.setBounds(50,70,100,40);
        HomeSensorFrame.add(label2);

        value2 = new JLabel("50 kmph");
        value2.setBounds(130,70,200,40);
        window =  new JLabel("Window");
        window.setBounds(200, 70, 200, 40 );
        HomeSensorFrame.add(value2);
        HomeSensorFrame.add(window);

        //Humidity

        JLabel label3 = new JLabel("Humidity: ");
        label3.setBounds(50,100,100,40);
        HomeSensorFrame.add(label3);

        value3 = new JLabel("30 %");
        value3.setBounds(130,100,200,40);
        dehumidifier = new JLabel("Dehumidifier");
        dehumidifier.setBounds(200, 100, 200 ,40);
        HomeSensorFrame.add(value3);
        HomeSensorFrame.add(dehumidifier);

        HomeSensorFrame.setSize(400,400);
        HomeSensorFrame.setLayout(null);
        HomeSensorFrame.setVisible(true);
        HomeSensorFrame.setTitle("Home Sensor");

    }


    @Override
    public void update(Observable obs, Object arg) {
        HomeSensor hs = (HomeSensor)obs;
        value1.setText(df.format(hs.getTemperature()) + " C");
        value2.setText(df.format(hs.getWindSpeed()) + " kmph");
        value3.setText(df.format(hs.getHumidity()) + "%");
        window.setText(hs.getWindow());
        ac.setText(hs.getAC());
        dehumidifier.setText(hs.getDehumidifier());

    }

}
