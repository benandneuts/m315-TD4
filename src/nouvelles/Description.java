package nouvelles;

import java.time.LocalDate;

public class Description {

	LocalDate departDate;
	String departPlace;
	String arrivalPlace;
	int duration;
	
	public Description (LocalDate departDate, String departPlace, String arrivalPlace, int duration) {
		this.departDate = departDate;
		this.departPlace = departPlace;
		this.arrivalPlace = arrivalPlace;
		this.duration = duration;
	}
	
	
}
