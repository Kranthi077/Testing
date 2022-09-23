package coreJava;

public class ChildCar extends ParentClass {

	public String name = "Swiftt";
	
	public void type() {

		System.out.println("SUV");
	}

	public void colour() {
		
		System.out.println("colour");
	}
	
	public static void main(String[] args) {
		
		ChildCar swift = new ChildCar();
		swift.braking();
		swift.gears();
		swift.desielEngine();
		swift.colour();
		swift.type();
		
		

	}

}
