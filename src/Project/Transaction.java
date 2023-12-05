package Project;

import java.time.LocalDate;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private String transactionId;
	private Customer customer;
	private Item item;
	private LocalDate checkOutDate, checkInDate;
	private Service service;



	public Transaction(String transactionId, Customer customer, Item item, LocalDate checkOutDate,
			LocalDate checkInDate, Service service) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.item = item;
		this.checkOutDate = checkOutDate;
		this.checkInDate = checkInDate;
		this.service = service;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void saveTransactions(ArrayList<Transaction> transactions, String txtFile) {
	    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(txtFile))) {
	        outputStream.writeObject(transactions);
	        System.out.println("Transactions saved successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public static ArrayList<Transaction> loadTransactions(String txtfile) {
	    ArrayList<Transaction> transactions = new ArrayList<>();
	    try (ObjectInputStream transInObj = new ObjectInputStream(new FileInputStream(txtfile))) {
	        Object obj = transInObj.readObject();
	        if (obj instanceof ArrayList) {
	            transactions = (ArrayList<Transaction>) obj;
	            System.out.println("Transactions loaded successfully.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return transactions;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customer=" + customer + ", item=" + item
				+ ", checkOutDate=" + checkOutDate + ", checkInDate=" + checkInDate + ", service=" + service + "]";
	}

}
