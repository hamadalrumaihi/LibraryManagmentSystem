package Project;

import java.time.LocalDate;

public class Customer {
private String customerId,firstName,lastName,address,phoneNumber;
private LocalDate dateOfBrith;
private boolean student; 

	public Customer(String customerId, String firstName, String lastName, String address, String phoneNumber,
		LocalDate dateOfBrith, boolean student) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.dateOfBrith = dateOfBrith;
	this.student = student;
}

	public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public LocalDate getDateOfBrith() {
	return dateOfBrith;
}

public void setDateOfBrith(LocalDate dateOfBrith) {
	this.dateOfBrith = dateOfBrith;
}

public boolean isStudent() {
	return student;
}

public void setStudent(boolean student) {
	this.student = student;
}

	@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber + ", dateOfBrith=" + dateOfBrith + ", student=" + student + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
