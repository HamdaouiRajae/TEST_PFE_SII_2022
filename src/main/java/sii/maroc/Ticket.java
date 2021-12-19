package sii.maroc;

public class Ticket  {
	
	
	private boolean order_Accepted=false;
	 private Integer numberOfDishes;
	
	public Ticket() {
		this.order_Accepted=order_Accepted;
		
		
	}
	
	public Integer getNumerofDiches() {
		return this.numberOfDishes;
	}
	
	public void setNumberOfDishes(Integer numberOfDishes) {
		this.numberOfDishes=numberOfDishes;
	}
	
	public boolean isOrder_Accepted() {
		return order_Accepted;
	}


	public void setOrder_Accepted() {
		this.order_Accepted = true ;
		
	}

	public Ticket and(String string) {
		
		return null;
	}

}