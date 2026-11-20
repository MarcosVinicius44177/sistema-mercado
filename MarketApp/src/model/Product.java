package model;

public class Product {
	
	public String name;
	public double price;
	public int stock;
	
	public String displayInformation() {
		return String.format("Product: %s"
							+ "%nPrice: $ %.2f"
							+ "%nStock: %d", name, price, stock);
	}
}
