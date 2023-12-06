package Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	private Application libraryMenu;
	public MainMenu() {
		ArrayList<Item> items = new ArrayList<>();
		ArrayList<Author> authors = new ArrayList<>();
		ArrayList<Customer> customers = new ArrayList<>();
		ArrayList<Transaction> transactions = Transaction.loadTransactions("Transaction.txt");
		this.libraryMenu = new Application(items, authors, customers, transactions);
	}


	public void addNewItem() {
		Scanner option = new Scanner(System.in);

		System.out.println("Add New Item:");
		System.out.println("1- Book");
		System.out.println("2- Scientific Journal");
		System.out.println("3- Magazine");
		System.out.println("4- News Paper");

		System.out.print("Choose the type of item to add (1-4): ");
		int itemType = option.nextInt();
		option.nextLine();
		switch(itemType) {
		case 1:
			addNewBook();
			break;

		case 2:
			addNewScientificJournal();
			break;

		case 3:
			addNewMagazine();
			break;

		case 4:
			addNewNewspaper();
			break;


		}
	}
	public void addNewBook() {
		Scanner bookIn = new Scanner(System.in);
		System.out.println("Adding a New Book:");
		System.out.print("Enter ISBN: ");
		String isbn = bookIn.nextLine();
		System.out.print("Enter genre: ");
		String genre = bookIn.nextLine();
		System.out.print("Enter description: ");
		String description = bookIn.nextLine();
		System.out.print("Enter item ID: ");
		int itemId = bookIn.nextInt();
		bookIn.nextLine(); 
		System.out.print("Enter title: ");
		String bookTitle = bookIn.nextLine();
		System.out.print("Enter author's first name: ");
		String authorFirstName = bookIn.nextLine();
		System.out.print("Enter author's last name: ");
		String authorLastName = bookIn.nextLine();
		
		Author author = new Author(authorFirstName, authorLastName, null);
		Book book = new Book(itemId, itemId, itemId, bookTitle, author, null, null, bookTitle, bookTitle, bookTitle);
		libraryMenu.getItems().add(book);



		System.out.println("Book added successfully");
	} 

	public void addNewScientificJournal() {
	    Scanner SciIn = new Scanner(System.in);
	    System.out.println("Adding a New Scientific Journal:");
	    System.out.print("Enter publication frequency: ");
	    String publicationFrequency = SciIn.nextLine();
	    System.out.print("Enter impact factor: ");
	    Double impactFactor = SciIn.nextDouble();
	    SciIn.nextLine();
	    System.out.print("Enter item ID: ");
	    int itemId = SciIn.nextInt();
	    SciIn.nextLine();
	    System.out.print("Enter title: ");
	    String title = SciIn.nextLine();
	    System.out.print("Enter author's first name: ");
	    String authorFirstName = SciIn.nextLine();
	    System.out.print("Enter author's last name: ");
	    String authorLastName = SciIn.nextLine();
	    Author author = new Author(authorFirstName, authorLastName, null);
	    ScientificJournals scientificJournal = new ScientificJournals(itemId, itemId, itemId, title, author, null, null, publicationFrequency, impactFactor);
	    libraryMenu.getItems().add(scientificJournal);

	    System.out.println("Scientific Journal added successfully");
	}


	public void addNewMagazine() {
	    Scanner magIn = new Scanner(System.in);
	    System.out.println("Adding a New Magazine:");
	    System.out.print("Enter issue number: ");
	    int issueNumber = magIn.nextInt();
	    magIn.nextLine();
	    System.out.print("Enter item ID: ");
	    int itemId = magIn.nextInt();
	    magIn.nextLine();
	    System.out.print("Enter title: ");
	    String title = magIn.nextLine();
	    System.out.print("Enter author's first name: ");
	    String authorFirstName = magIn.nextLine();
	    System.out.print("Enter author's last name: ");
	    String authorLastName = magIn.nextLine();
	    Author author = new Author(authorFirstName, authorLastName, null);
	    Magazines magazine = new Magazines(itemId, itemId, itemId, title, author, null, null, issueNumber);
	    libraryMenu.getItems().add(magazine);

	    System.out.println("Magazine added successfully");
	}

	public void addNewNewspaper() {
		Scanner newsIn = new Scanner(System.in);
		System.out.println("Adding a New Newspaper:");
		System.out.print("Enter item ID: ");
		int itemId = newsIn.nextInt();
		newsIn.nextLine();
		System.out.print("Enter title: ");
		String title = newsIn.nextLine();
		System.out.print("Enter author's first name: ");
		String authorFirstName = newsIn.nextLine();
		System.out.print("Enter author's last name: ");
		String authorLastName = newsIn.nextLine();
		Author author = new Author(authorFirstName, authorLastName, null);
		System.out.print("Enter price: ");
		double price = newsIn.nextDouble();
		newsIn.nextLine();
		System.out.print("Enter publishing date (yyyy-mm-dd): ");
		LocalDate publishingDate = LocalDate.parse(newsIn.nextLine());
		System.out.print("Enter issue language: ");
		String issueLanguage = newsIn.nextLine();
		NewsPaper newspaper = new NewsPaper(itemId, 0, 0, title, author, price, publishingDate, issueLanguage);
		libraryMenu.getItems().add(newspaper);

		System.out.println("Newspaper added successfully");
	}

	public void updateExistingItem() {
		Scanner itemUpdate = new Scanner(System.in);

		System.out.println("Update Existing Item:");

		System.out.print("Enter the title of the item to update: ");
		String searchTitle = itemUpdate.nextLine().trim().toLowerCase();

		Item foundItem = null;
		for (Item item : libraryMenu.getItems()) {
			if (item.getTitle().toLowerCase().equals(searchTitle)) {
				foundItem = item;
				break;
			}
		}

		if (foundItem == null) {
			System.out.println("Item not found.");
			return;
		}

		System.out.println("Found Item:");
		System.out.println(foundItem);

		System.out.println("Enter new details:");

		System.out.print("Enter new title: ");
		String newTitle = itemUpdate.nextLine().trim();
		foundItem.setTitle(newTitle);

		System.out.print("Enter new author first name: ");
		String newAuthorFirstName = itemUpdate.nextLine().trim();
		foundItem.getAuthor().setFirstName(newAuthorFirstName);

		System.out.print("Enter new author last name: ");
		String newAuthorLastName = itemUpdate.nextLine().trim();
		foundItem.getAuthor().setLastName(newAuthorLastName);

		System.out.println("Item updated successfully.");
	}

	public void deleteExistingItem() {
		Scanner delItem = new Scanner(System.in);

		System.out.println("Delete Existing Item:");
		System.out.print("Enter the title of the item to delete: ");
		String searchTitle = delItem.nextLine();

		Item foundItem = null;


		for (Item item : libraryMenu.getItems()) {
			if (item.getTitle().equalsIgnoreCase(searchTitle)) {
				foundItem = item;
				break;
			}
		}

		if (foundItem == null) {
			System.out.println("Item not found.");
			return;
		}


		libraryMenu.getItems().remove(foundItem);
		System.out.println("Item deleted successfully.");
	}
	
	
	public void addNewCustomer() {
	    Scanner customerInput = new Scanner(System.in);

	    System.out.println("Add New Customer:");

	    System.out.print("Enter customer ID: ");
	    String customerId = customerInput.nextLine().trim();

	 
	    for (Customer existingCustomer : libraryMenu.getCustomers()) {
	        if (existingCustomer.getCustomerId().equalsIgnoreCase(customerId)) {
	            System.out.println("Customer ID already exists. Please choose a different ID.");
	            return;
	        }
	    }

	    System.out.print("Enter first name: ");
	    String firstName = customerInput.nextLine().trim();

	    System.out.print("Enter last name: ");
	    String lastName = customerInput.nextLine().trim();

	    System.out.print("Enter address: ");
	    String address = customerInput.nextLine().trim();

	    System.out.print("Enter phone number: ");
	    String phoneNumber = customerInput.nextLine().trim();

	    System.out.print("Enter date of birth (yyyy-mm-dd): ");
	    LocalDate dateOfBirth = LocalDate.parse(customerInput.nextLine());

	    System.out.print("Is the customer a student? (true/false): ");
	    boolean isStudent = customerInput.nextBoolean();


	    Customer newCustomer = new Customer(customerId, firstName, lastName, address, phoneNumber, dateOfBirth, isStudent);

	
	    libraryMenu.getCustomers().add(newCustomer);

	    System.out.println("New customer added successfully.");
	}

	public void updateExistingCustomer() {
	    Scanner customerInput = new Scanner(System.in);

	    System.out.println("Update Existing Customer:");
	    System.out.print("Enter the Customer ID to update: ");
	    String searchCustomerId = customerInput.nextLine().trim();

	    Customer foundCustomer = null;
	    for (Customer customer : libraryMenu.getCustomers()) {
	        if (customer.getCustomerId().equalsIgnoreCase(searchCustomerId)) {
	            foundCustomer = customer;
	            break;
	        }
	    }

	    if (foundCustomer == null) {
	        System.out.println("Customer not found.");
	        return;
	    }

	    System.out.println("Found Customer:");
	    System.out.println(foundCustomer);

	    System.out.println("Enter new details:");

	    System.out.print("Enter new first name: ");
	    String newFirstName = customerInput.nextLine().trim();
	    foundCustomer.setFirstName(newFirstName);

	    System.out.print("Enter new last name: ");
	    String newLastName = customerInput.nextLine().trim();
	    foundCustomer.setLastName(newLastName);

	    System.out.print("Enter new address: ");
	    String newAddress = customerInput.nextLine().trim();
	    foundCustomer.setAddress(newAddress);

	    System.out.print("Enter new phone number: ");
	    String newPhoneNumber = customerInput.nextLine().trim();
	    foundCustomer.setPhoneNumber(newPhoneNumber);

	    System.out.print("Enter new date of birth (yyyy-mm-dd): ");
	    LocalDate newDateOfBirth = LocalDate.parse(customerInput.nextLine().trim());
	    foundCustomer.setDateOfBrith(newDateOfBirth);

	    System.out.print("Is the customer a student? (true/false): ");
	    boolean newIsStudent = customerInput.nextBoolean();
	    foundCustomer.setStudent(newIsStudent);

	    System.out.println("Customer updated successfully.");
	}


	public static void main(String[] args) {
		MainMenu menuSystem = new MainMenu();
		menuSystem.runMainMenu();


	}

	private void runMainMenu() {
		ArrayList<Transaction> transactions = Transaction.loadTransactions("Transaction.txt");
		Scanner option = new Scanner (System.in);
		while (true) {
			System.out.println("Main Menu");
			System.out.println("Choose one of the next bullets: ");
			System.out.println("1-  Add New Item");
			System.out.println("2-  Update Item");
			System.out.println("3-  Delete Existing Item");
			System.out.println("4-  Add new Customer");
			System.out.println("5-  Update Customer");
			System.out.println("6-  Delete Existing Customer");
			System.out.println("7-  Borrow Transaction.");
			System.out.println("8-  Return Transaction.");
			System.out.println("9-  List of Items Not Yet Returned.");
			System.out.println("10-  List All Author Publications.");
			System.out.println("11-  Save and Exit");

			System.out.print("Choose an option (1-11): ");
			int choice = option.nextInt();
			option.nextLine();

			switch (choice) {
			case 1:
				addNewItem();
				break;

			case 2:
				updateExistingItem();
				break;

			case 3:
				deleteExistingItem();
				break;

			case 4:
				addNewCustomer();
				break;

			case 5:
				updateExistingCustomer();
				break;

			case 6:
				break;

			case 7:
				break;

			case 8:
				break;

			case 9:
				break;

			case 10:
				break;
			case 11:
				Transaction.saveTransactions(libraryMenu.getTransactions(), "Transaction.txt");
				System.out.println("Transactions saved successfully.");
				System.out.println("Exiting the program.");
				System.exit(0);
				//PLEASE FIX THE SAVING METHOD
				Transaction newTransaction = new Transaction(null, null, null, null, null, null);
				libraryMenu.getTransactions().add(newTransaction);
				Transaction.saveTransactions(libraryMenu.getTransactions(), "Transaction.txt");

				break;

			default:
				System.out.println("Invalid option. Please choose a number between 1 and 11.");}





		}
	}

}
