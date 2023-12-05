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
		ArrayList<Service> service = new ArrayList<>();
		this.libraryMenu = new Application(items, authors, customers, service);
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
		String title = bookIn.nextLine();
		Author author = new Author(title, title, null);
		Book book = new Book(itemId, itemId, itemId, title, author, null, null, title, title, title);
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
		Author author = new Author(title, title, null);
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
		Author author = new Author(title, title, null);
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
		Newspaper newspaper = new Newspaper(itemId, 0, 0, title, author, price, publishingDate, issueLanguage);
		libraryMenu.getItems().add(newspaper);

		System.out.println("Newspaper added successfully");
	}





	public static void main(String[] args) {
		MainMenu menuSystem = new MainMenu();
		menuSystem.runMainMenu();


	}
	private void runMainMenu() {
		Scanner option = new Scanner (System.in);
		while (true) {
			System.out.println("Main Menu");
			System.out.println("Choose one of the next bullets: ");
			System.out.println("1-  Add New Item");
			System.out.println("2-  Update Existing Item");
			System.out.println("3-  Delete Existing Item");
			System.out.println("4-  Add new Customer");
			System.out.println("5-  Delete Existing Customer");
			System.out.println("6-  Borrow Transaction.");
			System.out.println("7-  Borrow Transaction.");
			System.out.println("8-  List of Items Not Yet Returned.");
			System.out.println("9-  List All Author Publications.");
			System.out.println("10-  Save and Exit");

			System.out.print("Choose an option (1-9): ");
			int choice = option.nextInt();
			option.nextLine();

			switch (choice) {
			case 1:
				addNewItem();
				break;

			case 2:


				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
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
				break;}





		}
	}

}