package org.bcits.second;

public class Product {
	String pName;
	double cost;
	
	public void setpName(String name) {
		this.pName= name;
	}
	
	public void setCost(double price) {
		this.cost= price;
	}
	
	String getpName() {
		return this.pName;
	}
	
	double getCost() {
		return this.cost;
	}
}
