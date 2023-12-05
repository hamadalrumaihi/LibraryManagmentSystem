package Project;

import java.io.Serializable;
import java.util.ArrayList;

public class Application implements Serializable {
ArrayList<Item>items=new ArrayList<Item>();
ArrayList<Author>authors=new ArrayList<Author>();
ArrayList<Customer>customers=new ArrayList<Customer>();
ArrayList<Service>service=new ArrayList<Service>();
public ArrayList<Item> getItems() {
	return items;
}
public Application(ArrayList<Item> items, ArrayList<Author> authors, ArrayList<Customer> customers,
		ArrayList<Service> service) {
	super();
	this.items = items;
	this.authors = authors;
	this.customers = customers;
	this.service = service;
}
public void setItems(ArrayList<Item> items) {
	this.items = items;
}
public ArrayList<Author> getAuthors() {
	return authors;
}
public void setAuthors(ArrayList<Author> authors) {
	this.authors = authors;
}
public ArrayList<Customer> getCustomers() {
	return customers;
}
public void setCustomers(ArrayList<Customer> customers) {
	this.customers = customers;
}
public ArrayList<Service> getService() {
	return service;
}
public void setService(ArrayList<Service> service) {
	this.service = service;
}
@Override
public String toString() {
	return "Application [items=" + items + ", authors=" + authors + ", customers=" + customers + ", service=" + service
			+ "]";
}
}
