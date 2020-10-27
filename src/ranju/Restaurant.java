

public class Restaurant{
	
	//Variable Declarations
	private int tableIdentifier;
	private int tableRunningOrder;
	private double cost;
	
	//Default Constructor
	public Restaurant(){
		tableIdentifier = 1;
		tableRunningOrder = 0;
		cost = 0.0;
	}

    //Constructor receiving arguments
	public Restaurant(int initTableIdentifier, int initTableRunningOrder, double initCost){
		tableIdentifier = initTableIdentifier;
		tableRunningOrder = initTableRunningOrder;
		cost = initCost;
	}

	public void setTableIdentifier(int initTableIdentifier){ 
		tableIdentifier = initTableIdentifier;
	}
	
	public void setTableRunningOrder(int  initTableRunningOrder){ 
		tableRunningOrder = initTableRunningOrder;
	}
	
	public void setCost(double initCost){ 
		cost = initCost;
	}
	
	public int getTableIdentifier(){ 
		return tableIdentifier;
	}
	
	public int getTableRunningOrder(){ 
		return tableRunningOrder;
	}
	
	public double getCost(){ 
		return cost;
	}

}
















