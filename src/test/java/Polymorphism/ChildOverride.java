package Polymorphism;

public class ChildOverride extends ParentOverride {

	public void Engine() {

		System.out.println("This engine is of a Bike");
	}

	public static void main(String[] args) {
		ChildOverride obj = new ChildOverride();
		obj.Brake();
		obj.Engine();

	}

}
