package Project;

import java.io.Serializable;
import java.util.ArrayList;

public class Application implements Serializable {
ArrayList<Item>items=new ArrayList<Item>();
ArrayList<Author>authors=new ArrayList<Author>();
ArrayList<Customer>customers=new ArrayList<Customer>();
private ArrayList<Transaction> transactions = new ArrayList<>();
public ArrayList<Item> getItems() {
	return items;
}
public Application(ArrayList<Item> items, ArrayList<Author> authors, ArrayList<Customer> customers,
        ArrayList<Transaction> transactions) {
    this.items = items;
    this.authors = authors;
    this.customers = customers;
    this.transactions = transactions;
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

public ArrayList<Transaction> getTransactions() {
	return transactions;
}
public void setTransactions(ArrayList<Transaction> transactions) {
	this.transactions = transactions;
}
public void addTransaction(Transaction transaction) {
    transactions.add(transaction);
}
@Override
public String toString() {
	return "Application [items=" + items + ", authors=" + authors + ", customers=" + customers + ", transactions="
			+ transactions + "]";
}

}