package coreJava;

public class ChildCar extends ParentClass {

	public String name = "Swiftt";

	public void type() {

		System.out.println("SUV");
	}

	public void colour() {

		System.out.println("colour");
	}

	public void desielEngine() {
		System.out.println("New Model diesel engine code is present here");
		// It will have coce related to new engine
	}

	public static void main(String[] args) {

		ChildCar swift = new ChildCar();
		swift.braking();
		swift.gears();
		swift.desielEngine();
		swift.colour();
		swift.type();

		System.out.println();

		ParentClass swift1 = new ChildCar();
		swift1.braking();
		swift1.gears();
		swift1.desielEngine();
		swift1.colour();

		System.out.println();

		ParentClass swift2 = new ParentClass();
		swift2.braking();
		swift2.gears();
		swift2.desielEngine();
		swift2.colour();

		ParentClass swift4 = new ChildCar();
		//ChildCar swift3 = new ParentClass();

	}

}
