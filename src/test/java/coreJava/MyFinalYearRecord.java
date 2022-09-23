package coreJava;

public class MyFinalYearRecord implements RecordInterface {

	public static void main(String[] args) {

		RecordInterface santhosh = new MyFinalYearRecord();
		santhosh.coverPage();
		santhosh.summaryPage();
		santhosh.tableOfConents();
		santhosh.recordInformation();
		santhosh.references();
		
	}

	public void coverPage() {
		System.out.println("Name: Santhosh");
		System.out.println("Id: 12234");
		System.out.println("Branch: Mech");
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
