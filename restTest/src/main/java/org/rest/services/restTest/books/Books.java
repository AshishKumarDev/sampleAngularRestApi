package org.rest.services.restTest.books;

public class Books {
	private int id;
	private String name;
	private int quantityPurchased;
	private int quantitySold;

	public Books() {
		
	}
	public Books(int id,String name,int quantityPurchased,int quantitySold){
		this.id=id;
		this.name=name;
		this.quantityPurchased=quantityPurchased;
		this.quantitySold=quantitySold;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	
}
