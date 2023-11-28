package Project;

import java.time.LocalDate;

public class Magazines extends Item{
private int issueNumber;

	public int getIssueNumber() {
	return issueNumber;
}

public void setIssueNumber(int issueNumber) {
	this.issueNumber = issueNumber;
}

	public Magazines(int id, int pages, int dueDays, String title, Author author, Double price, LocalDate publishingDate,
		int issueNumber) {
	super(id, pages, dueDays, title, author, price, publishingDate);
	this.issueNumber = issueNumber;
}

	@Override
	public String toString() {
		return "Magazines [issueNumber=" + issueNumber + "]";
	}

	public Magazines() {
		// TODO Auto-generated constructor stub
	}

}
