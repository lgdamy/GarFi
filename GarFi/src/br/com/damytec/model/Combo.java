package br.com.damytec.model;

import java.util.HashSet;
import java.util.Set;

public class Combo extends Vendable {
	
	public Combo() {
		super();
	}
	public Combo (Product... products) {
		this();
		this.populateProducts(products);
	}
	public Combo (String name, String description, float price, Product... products) {
		super(name, description, price);
		this.populateProducts(products);
	}
	
	private Set<Product> productSet = new HashSet<>();
	
	public Set<Product> getProductSet() {
		return productSet;
	}
	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}
	
	private void populateProducts(Product... products) {
		for (Product product : products) {
			this.productSet.add(product);
		}
	}
	
	/**
	 * Responsavel por calcular o valor de desconto com base nos precos
	 * individuais dos itens
	 * @return desconto
	 */
	public float getTotalDiscount() {
		float itemCost = 0f;
		for (Product product : productSet) {
			itemCost += product.getPrice();
		}
		return itemCost-this.getPrice();
	}
	/**
	 * Responsavel por calcular o tempo de preparo baseando no tempo de
	 * preparo do item mais demorado
	 * @return
	 */
	public int getPrepMinutes() {
		int maxTime = 0;
		for (Product product : productSet) {
			maxTime = Math.max(maxTime, product.getPrepMinutes());
		}
		return maxTime;
	}
	
}
