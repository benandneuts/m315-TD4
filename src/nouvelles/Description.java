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

	public LocalDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}

	public String getDepartPlace() {
		return departPlace;
	}

	public void setDepartPlace(String departPlace) {
		this.departPlace = departPlace;
	}

	public String getArrivalPlace() {
		return arrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
}
