package nouvelles;

import java.util.ArrayList;
import nouvelles.Trip;
import td4.cars.CarRental;
import td4.core.PayingItem;
import td4.core.Service4PI;

public class TravelOrganizer {
	ArrayList<Service4PI> services = new ArrayList<>();
	
	public TravelOrganizer(ArrayList<Service4PI> s) {
		this.services = s;
	}
	
	public TravelOrganizer() {
		this.services = null;
	}
	
	public void addService(Service4PI s) {
		this.services.add(s);
	}

	public Trip createATrip(Description d) {
		for(int i = 0 ; i < services.size(); i++) {
				return (Trip) services.get(i).find(d);
		}
		return null;
	}
}
