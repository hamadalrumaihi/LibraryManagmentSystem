package Project;

import java.time.LocalDate;

public class Book extends Item {
private String ISBN,genre,description;
/**
 *	1. ISBN (String): The International Standard Book Number uniquely identifies the book.
	2. genre (String): The genre or category of the book.
	3. description (String): A brief description or summary of the book
 */
	@Override
public String toString() {
	return "Book [ISBN=" + ISBN + ", genre=" + genre + ", description=" + description + "]";
}

	public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

	public Book(int id, int pages, int dueDays, String title, Author author, Double price, LocalDate publishingDate,
		String iSBN, String genre, String description) {
	super(id, pages, dueDays, title, author, price, publishingDate);
	ISBN = iSBN;
	this.genre = genre;
	this.description = description;
}

	

	public static void main(String[] args) {
	
	}

}
