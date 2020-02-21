public class Car {
	private int range;

	public Car(int data) {
		this.range = data;		
	}
		
	public boolean equals(Car a) {
		if (a.getClass() == this.getClass())
			System.out.println("At least it is the same class");

		System.out.println("Running this special case");
		return this.range == a.range;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Car) {
			System.out.println("They are the same instance");
			//I already know this is a car so I will act accordingly
			
			return this.equals((Car) o);
		}
		else {
			return false;
		}
		
	}
	
	public int numHoursDriven(int averageSpeed, int milesDriven) { 
		return milesDriven/averageSpeed;
	}
	
	public int milesToGo(int milesDriven) { 
		return range-milesDriven;
	}
	
	@Override
	public String toString() {
		return "This vehicle has a range of " + Integer.toString(range) + " miles";
	}
}