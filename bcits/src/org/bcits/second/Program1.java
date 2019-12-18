package org.bcits.second;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Student obj[] =new Student[4];
		for(int i=0; i<obj.length; i++) {
			obj[i] = new Student();
		}
		
		obj[0].setName("A");
		obj[1].setName("B");
		obj[2].setName("C");
		obj[3].setName("D");
		
		obj[0].setId(1);
		obj[1].setId(2);
		obj[2].setId(3);
		obj[3].setId(4);
		
		for(int i=0; i<obj.length; i++) {
			
			System.out.println( obj[i].getName()+" :  " +obj[i].getId());
		}
	}
}
