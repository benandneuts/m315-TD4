package nouvelles;

import java.util.*;

import td4.core.PayingItem;
import td4.core.Product;

public interface Service {
	ArrayList<Trip> trips = new ArrayList<>();
	
	public default PayingItem find(Description d) {
		for(int i = 0 ; i < trips.size(); i++) {
			for(int j = 0 ; j < trips.get(i).getProducts().size(); j++) {
				if( trips.get(i).getProducts().get(j) == d ) {
					return trips.get(i).getProducts().get(j);
				}
			}
		}
		return null;
	}
}
