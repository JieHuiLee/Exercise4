package Inheritance_Exercise4;

public class Logitech extends Mouse{
		
	private String wireless;//wl
	private int batteryLife;//l
        private double payment;//py
	
	public Logitech(String m, String c, String b,double w, double p, int q,String wl,int l,double py) {
		super(m,c,b,w,p,q);
		wireless = wl;
		batteryLife = l;
		payment = py;
	}
	
	public String getWireless() {
		return wireless;
	}
	
	 public int getBatteryLife() {
	        return batteryLife;
	 }
	  
	 public double getPayment() {
		return payment;
	}
		
	public double balance() {
		return payment - super.calDiscount() ;
	}
		
	public String toString() {
		return super.toString()+ "\nWireless\t: " + wireless + "\nBattery Life\t: " + batteryLife +"Days" + "\nPayment\t   : RM " + payment ;
	}		
	
}
