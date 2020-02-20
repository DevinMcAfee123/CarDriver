import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	
	Car car = new Car(100);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Test
	public void testCar() {
		Car car = new Car(100);
	}

	@Test
	public void testEqualsCar() {
		Car x = new Car(50);
		assertFalse(car.equals(x));
		
		Car y = new Car(100);
		assertTrue(car.equals(y));
	}

	@Test
	public void testEqualsObject() {
		Object x = new Car(100);
		car.equals(x);
		boolean actual = car.equals(x);
		boolean expected = true;
		assertEquals(expected, actual);
		
		String y = new String("Bogus car");
		assertEquals(false, car.equals(y));
		assertFalse(car.equals(y));
	}

	@Test
	public void testToString() {

		
		Car evCar = new Car(70);
		String expected = "This vehicle has a range of 70 miles";
		String actual = evCar.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMilesToGo() { 
		int milesDriven = 10;
		int expected = 90;
		int actual = car.milesToGo(10);
		assertEquals(expected, actual);
	}

}
