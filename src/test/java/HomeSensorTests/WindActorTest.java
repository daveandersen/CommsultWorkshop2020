package HomeSensorTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Draft2.WindActor;

class WindActorTest {
	WindActor wa = new WindActor();
	
	@Test
	void isDehumidiferOn() {
		assertEquals("WINDOW OPEN", wa.openWindow());
	}

	@Test
	void isDehumidiferOff() {
		assertEquals("WINDOW CLOSED", wa.closeWindow());
	}

}
