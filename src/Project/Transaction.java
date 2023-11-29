package Project;

import java.time.LocalDate;

public class Transaction {
private String transactionId;
private Customer customer;
private Item item;
private LocalDate checkOutDate,checkInDate;
private Service service;
public Transaction(String transactionId, Customer customer, Item item, LocalDate checkOutDate, LocalDate checkInDate,
		Service service) {
	super();
	this.transactionId = transactionId;
	this.customer = customer;
	this.item = item;
	this.checkOutDate = checkOutDate;
	this.checkInDate = checkInDate;
	this.service = service;
}
@Override
public String toString() {
	return "Transaction [transactionId=" + transactionId + ", customer=" + customer + ", item=" + item
			+ ", checkOutDate=" + checkOutDate + ", checkInDate=" + checkInDate + ", service=" + service + "]";
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public LocalDate getCheckOutDate() {
	return checkOutDate;
}
public void setCheckOutDate(LocalDate checkOutDate) {
	this.checkOutDate = checkOutDate;
}
public LocalDate getCheckInDate() {
	return checkInDate;
}
public void setCheckInDate(LocalDate checkInDate) {
	this.checkInDate = checkInDate;
}
public Service getService() {
	return service;
}
public void setService(Service service) {
	this.service = service;
}
}
