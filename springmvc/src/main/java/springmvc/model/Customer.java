package springmvc.model;

import java.util.*;

public class Customer {

	private String name;
	private String id;
	private String dob;
	private List<String> cars;
	private String gender;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", dob=" + dob + ", cars=" + cars + ", gender=" + gender
				+ ", type=" + type + "]";
	}

}
