package edu.kpi.zakharov.labs;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Main {
	
	public static ArrayList<Car> createCarList() {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1,"Toyota","Camry",2020,"black" ,25000d,"KA7777NA"));
		cars.add(new Car(2,"Nissan","Camry",2020,"black" ,25000d,"KA7777NA"));
		return cars;
	}
	
	public static void main(String args[]) {
		Catalouge catalouge = new Catalouge(createCarList());
		catalouge.searchByMark("Toyota");
		catalouge.searchByModelAndUsageTime("Camry", 1);
		catalouge.searchByYearAndPrice(2020, 20000d);
	}
	
	
	

}
