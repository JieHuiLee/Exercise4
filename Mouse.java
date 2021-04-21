package Inheritance_Exercise4;

import java.util.Scanner; 

public class Mouse {
	
	private String model;//m
	private String color;//c
	private String brand;//b
	private double weight;//w
	private double price; //p
	private int quantity; //q
	
	Scanner read = new Scanner(System.in);
	
	//Default Constructor
	public Mouse() {
		System.out.print("Please Enter Model\t: ");
		this.model = read.nextLine();
		
		System.out.print("Please Enter Color\t: ");
		this.color = read.nextLine();
		
		System.out.print("Please Enter Brand\t: ");
		this.brand = read.nextLine();	
		
		System.out.print("Please Enter Weight(g)  : ");
		this.weight = read.nextDouble();
		
		System.out.print("Please Enter Price\t: RM ");
		this.price = read.nextDouble();
		
		System.out.print("Please Enter Quantity\t: ");
		this.quantity = read.nextInt();
	}
	
	//Parameterized Constructor
	public Mouse(String m, String c, String b, double w, double p, int q){
		model = m;
		color = c;
		brand = b;
		weight = w;
		price = p;
		quantity = q;
         }
	
	 // Create Getter Method
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
	  }
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getPrice() {
		  return this.price;
	  }
	  
	  public double getQuantity() {
		  return this.quantity;
	  }
	  
	  public double calTotalPrice() {
		  return this.price * this.quantity;
	  }
	  
	  public double calDiscount() {
		return calTotalPrice() - calTotalPrice() * 0.12;
	  }
	  
	  public String toString() {
		  return "\nModel\t: " + model + "\nColor\t: " +color +"\nBrand\t: " + brand +"\nWeight\t: "+ weight + "g"+ "\nPrice\t: RM " + price+" (per unit)"
				 + "\nQuantity: " + quantity;
	  }
	
}
