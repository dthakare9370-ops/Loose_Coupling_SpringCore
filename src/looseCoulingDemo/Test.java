package looseCoulingDemo;

public class Test {
	public static void main(String args[]) {
		IEngine engine = new PetrolEngine();
		
		Car c = new Car(engine);
		c.drive();
	}
}
