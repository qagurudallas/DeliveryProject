import java.io.*;

public class Delivery {

	private String name;
	private String phone;

	public Delivery(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getname() {
		return name;
	}

	// Distance returns $10 if less than 10 km
	public int Distance(int km) {
		if (km < 10 && km > 0) {
			return 10;
		}

		if (km > 10 && km < 50) {
			return 25;
		}

		if (km < 0) {
			return -1;
		}
		if (km > 50) {
			return -2;
		} else {
			return 0;
		}

	}

	// return $20 when distance is <10 and has stairs
	// $35 when distance is >10km and has stairs
	public int DistanceAndStairs(int km) {
		if (km < 10) {
			return 20;
		}

		if (km > 10) {
			return 35;
		}

		else {
			return 0;
		}

	}

	public int Distance30(int distance) {

		return 100;
	}

	public int weekend() {
		return 50;
	}

	public String errorMessage() {

		return "Please select at least one distance";
	}

}
