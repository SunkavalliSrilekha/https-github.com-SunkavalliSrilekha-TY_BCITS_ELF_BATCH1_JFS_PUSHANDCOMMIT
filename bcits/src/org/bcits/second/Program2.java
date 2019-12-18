package org.bcits.second;

public class Program2 {
	public static void main(String[] args) {
		Product obj[] =new Product[4];
		for(int i=0; i<obj.length; i++) {
			obj[i] = new Product();
		}
		
		obj[0].setpName("Pen");
		obj[1].setpName("Pencil");
		obj[2].setpName("Chocolate");
		obj[3].setpName("Ball");
		
		obj[0].setCost(20.5);
		obj[1].setCost(10);
		obj[2].setCost(100);
		obj[3].setCost(50.9);
		
		for(int i=0; i<obj.length; i++) {
			
			System.out.println( obj[i].getpName()+" :  " +obj[i].getCost());
		}
	}
}
