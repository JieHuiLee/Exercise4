package Inheritance_Exercise4;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to gadget shop");
		System.out.print("--------------------------\n");
		
		Mouse obj1 = new Mouse();
		System.out.println("\nMouse Detail");
		System.out.print("=============================");
		System.out.println(obj1);
		System.out.printf("%-11s%5.2f","Total Price: RM ", obj1.calTotalPrice());		
		System.out.printf("\n%-11s%5.2f","Price after discount (12%): RM ", obj1.calDiscount());
		System.out.println();
		
		Logitech obj2 = new Logitech("MX Master 3","Black","Logitech",100.0,379.20,2,"Yes",70,2000.00);
		System.out.println("\nLogitech Mouse Detail");
		System.out.print("=============================");
		System.out.println(obj2);
		System.out.printf("%-11s%5.2f","Total Price: RM ", obj2.calTotalPrice());			
		System.out.printf("\n%-11s%5.2f","Price after discount (12%): RM ", obj2.calDiscount());		
		System.out.printf("\n%-11s%5.2f","Balance\t   : RM ", obj2.balance());
		
		System.out.println("\n\n=======Thank You======");
	}

}
