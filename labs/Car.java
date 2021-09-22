package edu.kpi.zakharov.labs;

public class Car {
	int id;
	String mark;
	String model;
	int year;
	String color;
	double price;
	String numberReg;
	
	public Car(int id, String mark,String model, int year,String color, double price,String numberReg) {
		this.id=id;
		this.mark=mark;
		this.model=model;
		this.year = year;
		this.color=color;
		this.price=price;
		this.numberReg=numberReg;
	}

	public int getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setDate(short date) {
		this.year = date;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNumberReg() {
		return numberReg;
	}

	public void setNumberReg(String numberReg) {
		this.numberReg = numberReg;
	}
	
	public String toString() {
			return id+" "+mark+" "+model+" "+year+" "+color+" "+price+" "+numberReg;  
	}
	
}
