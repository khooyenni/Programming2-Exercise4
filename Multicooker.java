package Exercise4;

import java.util.Scanner;

public class Multicooker {
	
	private String brand, model, colour;
	private double price;
	
	Scanner in = new Scanner(System.in);
	
	//Default constructor
	Multicooker(){
		System.out.println("Please enter the brand of the multicooker : ");
		this.brand=in.nextLine();
		
		System.out.println("Please enter the model of the multicooker : ");
		this.model=in.nextLine();
		
		System.out.println("Please enter the colour of the multicooker ");
		this.colour=in.nextLine();
		
		System.out.println("Please enter the price of the multicooker");
		this.price=in.nextDouble();
		
	}
	
	//Parameterized constructor
	Multicooker(String b, String m, String c, double p){
		this.brand = b;
		this.model = m;
		this.colour = c;
		this.price = p;
		
	}
	
	public String getbrand() {
		return this.brand;
	}
	
	public String getmodel() {
		return this.model;
	}
	
	public String getcolour() {
		return this.colour;
	}
	
	public double getprice() {
		return this.price;
	}	
	
	public String toString() {
		return "\nBrand\t\t\t: " + brand + "\nModel\t\t\t: " + model + "\nColour\t\t\t: " + colour + "\nPrice\t\t\t: " + price;
	}

}
