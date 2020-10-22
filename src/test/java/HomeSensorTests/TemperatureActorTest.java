package HomeSensorTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Draft2.TemperatureActor;

class TemperatureActorTest {
	TemperatureActor ta = new TemperatureActor();
	
	@Test
	void isDehumidiferOn() {
		assertEquals("AC TURNED ON", ta.turnOnAc());
	}

	@Test
	void isDehumidiferOff() {
		assertEquals("AC TURNED OFF", ta.turnOffAc());
	}
}
