package TennisKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisTest {
	
	private Tennis scoring = new Tennis();

	@Test
	public void serverWinsAPointAt00() {
		scoring.workoutScore(true);
		assertEquals("15", scoring.getServerScore());
		assertEquals("0", scoring.getReceiverScore());
	}
	
	@Test
	public void receiverWinsAPointAt1515() {
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		assertEquals("15", scoring.getServerScore());
		assertEquals("30", scoring.getReceiverScore());
	}
	
	@Test
	public void serverWinsAPointAt3030() {
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(true);
		assertEquals("40", scoring.getServerScore());
		assertEquals("30", scoring.getReceiverScore());
	}
	
	@Test
	public void receiverWinsAPointAt4040() {
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		assertEquals("40", scoring.getServerScore());
		assertEquals("A", scoring.getReceiverScore());
	}
	
	@Test
	public void receiverWinsAPointAtA40() {
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		assertEquals("40", scoring.getServerScore());
		assertEquals("40", scoring.getReceiverScore());
	}
	
	@Test
	public void serverWinsAPointAt4030() {
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(true);
		assertEquals("Winner", scoring.getServerScore());
		assertEquals("30", scoring.getReceiverScore());
	}
	
	@Test
	public void recieverWinsAPointAt40A() {
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(true);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		scoring.workoutScore(false);
		assertEquals("40", scoring.getServerScore());
		assertEquals("Winner", scoring.getReceiverScore());
	}

}
