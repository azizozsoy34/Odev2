package Entities;

import java.sql.Date;

public class Customer {
	private int Id;
	private String NationalityId;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int id, String nationalityId, String firstName, String lastName, Date dateOfBirth) {
		
		Id = id;
		NationalityId = nationalityId;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	
}
