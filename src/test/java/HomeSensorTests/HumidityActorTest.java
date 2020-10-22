package HomeSensorTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Draft2.HumidityActor;

class HumidityActorTest {
	HumidityActor ha = new HumidityActor();
	
	@Test
	void isDehumidiferOn() {
		assertEquals("DEHUMIDIFIER ON", ha.turnOn());
	}

	@Test
	void isDehumidiferOff() {
		assertEquals("DEHUMIDIFIER OFF", ha.turnOff());
	}
}
