package HomeSensorTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Draft2.HumidityActor;
import Draft2.TemperatureActor;
import Draft2.WindActor;

import Draft2.HumiditySensor;
import Draft2.TemperatureSensor;
import Draft2.WindSensor;

class ControllerTest {
	
	TemperatureActor ta = new TemperatureActor();
	WindActor wa = new WindActor();
	HumidityActor ha = new HumidityActor();
	
	TemperatureSensor t = new TemperatureSensor(0);
    WindSensor w = new WindSensor(0);
    HumiditySensor h = new HumiditySensor(0);
    
    String ac, dehumidifier, window;
    
    private String temperatureControl(int temperature) {		
		if(temperature > 30) {
			ac = ta.turnOnAc();
		}
		else {
			ac = ta.turnOffAc();
		}
		
		return ac;
    }
    
    private String windControl(int wind) {		
		if(wind < 40) {
			window = wa.openWindow();
		}
		else {
			window = wa.closeWindow();
		}
		
		return window;
    }
    
    private String humidityControl(int humidity) {		
		if(humidity > 50) {
			dehumidifier = ha.turnOn();
		}
		else {
			dehumidifier = ha.turnOff();
		}
		
		return dehumidifier;
    }

	@Test
	void acShouldTurnOn() {
		assertEquals("AC TURNED ON", temperatureControl(35));
	}

	@Test
	void acShouldTurnOff() {
		assertEquals("AC TURNED OFF", temperatureControl(18));
	}
	
	@Test
	void windowShouldOpen() {
		assertEquals("WINDOW OPEN", windControl(23));
	}

	@Test
	void windowShouldClose() {
		assertEquals("WINDOW CLOSED", windControl(60));
	}
	
	@Test
	void dehumidifierShouldTurnOn() {
		assertEquals("DEHUMIDIFIER ON", humidityControl(70));
	}

	@Test
	void dehumidifierShouldTurnOff() {
		assertEquals("DEHUMIDIFIER OFF", humidityControl(35));
	}
}
