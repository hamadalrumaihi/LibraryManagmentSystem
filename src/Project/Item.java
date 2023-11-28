package Project;

import java.time.LocalDate;

public class Item {
private int Id,pages,dueDays;
private String title;
private Author author;
private Double Price;
private LocalDate publishingDate;
	public Item(int id, int pages, int dueDays, String title, Author author, Double price, LocalDate publishingDate) {
	super();
	Id = id;
	this.pages = pages;
	this.dueDays = dueDays;
	this.title = title;
	this.author = author;
	Price = price;
	this.publishingDate = publishingDate;
}
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getDueDays() {
		return dueDays;
	}
	public void setDueDays(int dueDays) {
		this.dueDays = dueDays;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public LocalDate getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", pages=" + pages + ", dueDays=" + dueDays + ", title=" + title + ", Price=" + Price
				+ ", publishingDate=" + publishingDate + "]";
	}

}
