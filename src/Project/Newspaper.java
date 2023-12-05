package Project;

import java.io.Serializable;
import java.time.LocalDate;

public class Newspaper extends Item implements Serializable{
    private String issueLanguage;

    public Newspaper(int id, int pages, int dueDays, String title, Author author, Double price,
                     LocalDate publishingDate, String issueLanguage) {
        super(id, pages, dueDays, title, author, price, publishingDate);
        this.issueLanguage = issueLanguage;
    }

    public String getIssueLanguage() {
        return issueLanguage;
    }

    public void setIssueLanguage(String issueLanguage) {
        this.issueLanguage = issueLanguage;
    }

    @Override
    public String toString() {
        return "Newspaper [issueLanguage=" + issueLanguage + "] " + super.toString();
    }
}
