package edu.kpi.zakharov.labs;

import java.util.ArrayList;
import java.util.Calendar;

public class Catalouge {
		private ArrayList<Car> cars = new ArrayList<Car>();
		
		public Catalouge(ArrayList<Car> lst) {
			this.cars=lst;
		}
		
		public void searchByMark(String mark) {
			cars.stream().filter(car->car.getMark()==mark).forEach(x->System.out.println(x.toString()));		
		}
		
		public void searchByModelAndUsageTime(String model, int n) {
			cars.stream().filter(car->car.getModel()==model && (Calendar.getInstance().get(Calendar.YEAR)-car.getYear())>n)
				.forEach(x->System.out.println(x.toString()));		
		}
		
		public void searchByYearAndPrice(int year, double price) {
			cars.stream().filter(car->car.getYear()==year && car.getPrice()>price)
				.forEach(x->System.out.println(x.toString()));		
		}
}
