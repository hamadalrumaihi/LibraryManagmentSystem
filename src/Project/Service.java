package Project;


public class Service {
	private Boolean printing,proofReading;
	private Double printintgCostPerPage,proofReadingCostPerPage;
	
	public Service(Boolean printing, Boolean proofReading, Double printintgCostPerPage,
			Double proofReadingCostPerPage) {
		super();
		this.printing = printing;
		this.proofReading = proofReading;
		this.printintgCostPerPage = printintgCostPerPage;
		this.proofReadingCostPerPage = proofReadingCostPerPage;
	}
	public Boolean getPrinting() {
		return printing;
	}
	public void setPrinting(Boolean printing) {
		this.printing = printing;
	}
	public Boolean getProofReading() {
		return proofReading;
	}
	public void setProofReading(Boolean proofReading) {
		this.proofReading = proofReading;
	}
	public Double getPrintintgCostPerPage() {
		return printintgCostPerPage;
	}
	public void setPrintintgCostPerPage(Double printintgCostPerPage) {
		this.printintgCostPerPage = printintgCostPerPage;
	}
	public Double getProofReadingCostPerPage() {
		return proofReadingCostPerPage;
	}
	public void setProofReadingCostPerPage(Double proofReadingCostPerPage) {
		this.proofReadingCostPerPage = proofReadingCostPerPage;
	}
	@Override
	public String toString() {
		return "Service [printing=" + printing + ", proofReading=" + proofReading + ", printintgCostPerPage="
				+ printintgCostPerPage + ", proofReadingCostPerPage=" + proofReadingCostPerPage + "]";
	}
}
