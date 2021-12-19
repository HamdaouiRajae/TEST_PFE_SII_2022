package sii.maroc;

public class Meal {
	
	
    private boolean MealInPreparationLine=false;
    private Integer numberOfDishes;
    
    public Meal(Integer numberOfDishes) {
    	this.numberOfDishes = numberOfDishes;
    	this.MealInPreparationLine=MealInPreparationLine;
    }
    
	public boolean isMealInPreparationLine() {
		return MealInPreparationLine;
	}

	public void setMealInPreparationLine() {
		this.MealInPreparationLine = true;
		
	}
	public int servedDishes() {
		if (MealInPreparationLine==true) {
			
		return this.numberOfDishes;
		}
		else return 0;
	}

	public int cookingDuration() {
		
		return 6;
	}

	



}