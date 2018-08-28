package br.com.damytec.model;

public class Product extends Vendable {
	
	private int prepMinutes;
	
	
	public Product(String name, String description, float price, int prepMinutes) {
		super(name, description, price);
		this.setPrepMinutes(prepMinutes);
	}
	
	public Product(int prepMinutes) {
		this();
		this.prepMinutes = prepMinutes;
	}
	
	public Product() {
		super();
	}
	
	public int getPrepMinutes() {
		return prepMinutes;
	}
	public void setPrepMinutes(int prepMinutes) {
		this.prepMinutes = prepMinutes;
	}
	
	
	
	
}
