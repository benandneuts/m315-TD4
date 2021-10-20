package nouvelles;

import java.util.*;

import td4.core.PayingItem;

public interface Service {
	
	public PayingItem find(Description d); 
	/*
	{
		for(int i = 0 ; i < trips.size(); i++) {
			for(int j = 0 ; j < trips.get(i).getProducts().size(); j++) {
				if( trips.get(i).getProducts().get(j)description ?? == d ) {
					return trips.get(i).getProducts().get(j);
				}
			}
		}
		return null;
	}
	*/
}