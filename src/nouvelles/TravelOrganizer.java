package nouvelles;

import java.util.ArrayList;
import nouvelles.Trip;

public class TravelOrganizer {
	ArrayList<Service> services = new ArrayList<>();
	
	TravelOrganizer(ArrayList<Service> s) {
		services = s;
	}
	
	TravelOrganizer() {
		services = null;
	}
	
	public void addService(Service s) {
		services.add(s);
	}
	
	public Trip createATrip(Description d) {
		return new Trip(d);
		
	}
}
