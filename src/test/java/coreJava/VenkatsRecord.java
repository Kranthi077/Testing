package coreJava;

public class VenkatsRecord implements RecordInterface{

	public static void main(String[] args) {

		RecordInterface venkat = new VenkatsRecord();
		venkat.coverPage();
		venkat.summaryPage();
		venkat.tableOfConents();
		venkat.recordInformation();
		venkat.references();
		VenkatsRecord venkatsOwnMethods = new VenkatsRecord();
		venkatsOwnMethods.preface();
	}
	
	public void preface() {
		System.out.println("This Page conatins preface");
	}

	public void coverPage() {
		System.out.println("Id: 12234");
		System.out.println("Branch: Mech");
		System.out.println("Name: Venkat");
		System.out.println("Project Title");
	}

	public void summaryPage() {
		System.out.println("Here goes my summary");
	}

	public void tableOfConents() {
		System.out.println("Table of contents section");
	}

	public void recordInformation() {
		System.out.println("My project related detailed information");
	}

	public void references() {
		System.out.println("Material I referred");
	}

}
