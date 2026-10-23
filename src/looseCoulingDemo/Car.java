package looseCoulingDemo;

public class Car {
	
	IEngine engine;
	
	//Contructor Dependacies Injection 
	Car(IEngine engine){
		this.engine = engine;
	}
	
	void drive() {
		engine.start();
		System.out.println("Drive the car ..");
	}
	
	//Setter Depends Injection 
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	//Field Injector 
}
