package mapsdemo;

import java.util.Objects;

/** 
 * Author  : Shubhangi.Tiwari
 * Date    : Sep 9, 2025
 * Time    : 3:29:07 PM
 * project : CoreJava

 */

//Manager class to represent a manager in the organization.
//He can have multiple employees assigned to him.

public class Manager {
	private int id;
	private String name;


	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.printf("      [Employee ID: %d | Name: %-10s | Department: %s]%n", id, name);
	}

	//override equal &hashcode so Hashmap can identify managers equally
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



}
