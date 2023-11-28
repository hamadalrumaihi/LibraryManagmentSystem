package Project;

import java.time.LocalDate;

public class ScientificJournals extends Item {
private String publicationFrequency;
private Double impactFactor ;
/**
 *	1. publicationFrequency (String): Represents how often the scientific journal is published (e.g.,
		monthly, quarterly).
	2. impactFactor (double): The impact factor of the scientific journal, indicating its average number
		of citations.
 */
	public ScientificJournals() {
		// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	return "ScientificJournals [publicationFrequency=" + publicationFrequency + ", impactFactor=" + impactFactor + "]";
}
public String getPublicationFrequency() {
	return publicationFrequency;
}
public void setPublicationFrequency(String publicationFrequency) {
	this.publicationFrequency = publicationFrequency;
}
public Double getImpactFactor() {
	return impactFactor;
}
public void setImpactFactor(Double impactFactor) {
	this.impactFactor = impactFactor;
}
public ScientificJournals(int id, int pages, int dueDays, String title, Author author, Double price,
		LocalDate publishingDate, String publicationFrequency, Double impactFactor) {
	super(id, pages, dueDays, title, author, price, publishingDate);
	this.publicationFrequency = publicationFrequency;
	this.impactFactor = impactFactor;
}

}
