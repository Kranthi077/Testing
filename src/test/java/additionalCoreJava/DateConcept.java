package additionalCoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {

	 //Class obj = new Class();
		Date dt = new Date();
		System.out.println(dt.toString());
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh");
		System.out.println(sdf4.format(dt));
		
		///System.out.println(dt);
		
		// To print date in your own required format
		//https://www.tutorialspoint.com/java/java_date_time.htm
		//https://www.digitalocean.com/community/tutorials/java-simpledateformat-java-date-format
		SimpleDateFormat sdf = new SimpleDateFormat("d-MM-y");
		System.out.println(sdf.format(dt));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("d/MM/y");
		System.out.println(sdf1.format(dt));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/MM/y hh:mm:ss");
		System.out.println(sdf2.format(dt));
		
	}

}
