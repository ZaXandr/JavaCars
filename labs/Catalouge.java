package edu.kpi.zakharov.labs;

import java.util.ArrayList;

public class Catalouge {
		private ArrayList<Car> cars = new ArrayList();
		
		public Catalouge(ArrayList<Car> lst) {
			this.cars=lst;
		}
		
		public void searchByMark(String mark) {
			cars.stream().filter(car->car.getMark()==mark).forEach(x->System.out.println(x.toString()));		
		}
		
		public void searchByModelAndUsageTime(String model, int n) {
			cars.stream().filter(car->car.getModel()==model && (2021-car.getDate())>n)
				.forEach(x->System.out.println(x.toString()));		
		}
		
		public void searchByYearAndPrice(int year, double price) {
			cars.stream().filter(car->car.getDate()==year && car.getPrice()>price)
				.forEach(x->System.out.println(x.toString()));		
		}
}
