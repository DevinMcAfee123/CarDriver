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
			return this.equals(o);
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return  Integer.toString(range);
	}
}