package coreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoooFlights extends FlightAbstractClass {

	public static void main(String[] args) {
		IndigoooFlights flight1 = new IndigoooFlights();
		flight1.engineGuideLines();
		flight1.safetyGuideLines();
		flight1.logo();
		flight1.colour();
		
		FlightAbstractClass flight2 = new IndigoooFlights();

		flight2.engineGuideLines();
		flight2.safetyGuideLines();
		flight2.logo();
		flight2.colour();
		
		/* not possible
		 * FlightAbstractClass flight3 = new FlightAbstractClass();
		 * flight3.engineGuideLines(); flight3.safetyGuideLines(); flight3.logo();
		 * flight3.colour();
		 */

	}


	@Override
	public void logo() {
		System.out.println("This is my Logo");

	}

	@Override
	public void colour() {
		System.out.println("White colour");

	}

}
