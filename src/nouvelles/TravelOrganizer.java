package nouvelles;

import java.util.ArrayList;
import nouvelles.Trip;
import td4.cars.CarRental;
import td4.core.Service4PI;

public class TravelOrganizer {
	ArrayList<Service> services = new ArrayList<>();
	
	public TravelOrganizer(ArrayList<Service> s) {
		this.services = s;
	}
	
	public TravelOrganizer() {
		this.services = null;
	}
	
	public void addService(Service s) {
		this.services.add(s);
	}

	public Trip createATrip(Description d) {
		return new Trip(d);
	}
}
