package com.languagefundamentals.Constructors;

public class Car {
	
	String Model;
	String Brand;
	double Price;
	
	Car(){
		System.out.println("No Arg Constructor Called!");
		Model = "Unknown";
		Brand = "Unknown";
		Price = 1000000;
	}
	
	Car(String Model,String Brand, double Price){
		this.Model = Model;
		this.Brand = Brand;
		this.Price = Price;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method Strated!");
		
		Car c1 = new Car();
		c1.show();
		
		Car c2 = new Car();
		c2.Model = "Sonet";
		c2.Brand = "KIA";
		c2.Price = 1500000;
		c2.show();
		
		Car c3 = new Car ("Seltos","KIA",2000000.00);
		c3.show();
		
		
		System.out.println("Main method Ended!");

	}
	void show() {
		System.out.println("*****");
		System.out.println("Model of the car  :" + Model);
		System.out.println("Brand of the car  :"+ Brand);
		System.out.println("Prize of the car  :" + Price);
	}

}
