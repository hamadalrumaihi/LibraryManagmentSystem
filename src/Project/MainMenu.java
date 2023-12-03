package Project;

import java.util.Scanner;

public class MainMenu {
	private Application libraryMenu;
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
		}
	}
	public void addNewBook() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Adding a New Book:");


		System.out.print("Enter ISBN: ");
		String isbn = scanner.nextLine();

		System.out.print("Enter genre: ");
		String genre = scanner.nextLine();

		System.out.print("Enter description: ");
		String description = scanner.nextLine();


		System.out.print("Enter item ID: ");
		int itemId = scanner.nextInt();
		scanner.nextLine(); 

		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		Author author = new Author();
		Book book = new Book();
		libraryMenu.getItems().add(book);

		System.out.println("Book added successfully");
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
			System.out.println("2-  Delete Existing Item");
			System.out.println("3-  Add new Customer");
			System.out.println("4-  Delete Existing Customer");
			System.out.println("5-  Borrow Transaction.");
			System.out.println("6-  Borrow Transaction.");
			System.out.println("7-  List of Items Not Yet Returned.");
			System.out.println("8-  List All Author Publications.");
			System.out.println("9-  Save and Exit");

			System.out.print("Choose an option (1-9): ");
			int choice = option.nextInt();
			option.nextLine();

			switch (choice) {
			case 1:
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
			}





		}
	}

}