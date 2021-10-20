package nouvelles;

import java.util.ArrayList;
import nouvelles.Trip;
import td4.cars.CarRental;
import td4.core.Service4PI;

public class TravelOrganizer {
	ArrayList<Service4PI> services = new ArrayList<>();
	
	public TravelOrganizer(ArrayList<Service4PI> s) {
		services = s;
	}
	
	public TravelOrganizer() {
		services = null;
	}
	
	public void addService(Service4PI s) {
		services.add(s);
	}
	
	public Trip createATrip(Description d) {
		return new Trip(d);
		
	}
}
