package nouvelles;

import java.util.ArrayList;
import td4.core.PayingItem;

public class Trip {
	
	ArrayList<PayingItem> products;
	Description description;
	
	public Trip(Description description) {
		this.description = description;
	}

	public ArrayList<PayingItem> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<PayingItem> products) {
		this.products = products;
	}
	
	public double getPrice() {
		double price;
		for (int i=0 ; i<products.size() ; i++) {
			price += products[i].getPrice();
		}
		return price;
	}
	
	public void addItem(PayingItem product) {
		products.add(product);
	}
	
	

}
