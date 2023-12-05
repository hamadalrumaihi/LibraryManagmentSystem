package Project;

import java.io.Serializable;
import java.time.LocalDate;

public class Book extends Item implements Serializable {
private String ISBN,genre,description;
private Author author;

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

	public void addBook() {
		
	}

	public static void main(String[] args) {
	
	}

}
