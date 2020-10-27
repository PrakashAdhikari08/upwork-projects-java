

import java.util.Scanner;  // this is needed only if you need input from keyboard
   
public class RestaurantProgram{
		public static void main(String[] args)
		{ 
			Scanner input = new Scanner(System.in);    // this is needed only if you need input from keyboard 
		
		
		Restaurant table1 = new Restaurant(1,2,0.0);
		Restaurant table2 = new Restaurant(2,0,0.0);
		Restaurant table3 = new Restaurant(3,1,0.0);
		Restaurant table4 = new Restaurant(4,3,0.0);
		Restaurant selectTable = new Restaurant();
		
		//Variable Declarations
		int choice;
		int tableNum;
		double cost;
	    int numberOfDishes;
		int numberOfDishesEntered;
		int dishesQuantity;
	   
	  //constants declarations
		final int EXIT = 0;
		final double DishA = 20;
		final double DishB = 23;
		final double DishC = 18;
		final double DishD = 17;
		final double DishE = 8;
		
		
		//code
		
	       
		//display menu options	
	
		do {
			            System.out.println("\n1. Reset table");
						System.out.println("\n2. Add to the order");
						System.out.println("\n3. Delete from the order");
						System.out.println("\n4. Display Total Bill");
						System.out.println("\n5. Change Table Identifier");
						System.out.println("\n6. Exit");
						choice = input.nextInt();
					
					switch (choice) {
						case 1:
						{
						System.out.print("\n Enter Table num" );	
					    tableNum = input.nextInt();
				     	table1.setTableRunningOrder(getTableRunningOrder);
						}break;
						case 2:
						{
						System.out.print("\n Enter different dishes" );
					    numberOfDishes = input.nextInt();
						for(numberOfDishesEntered = 0; numberOfDishesEntered < numberOfDishes; numberOfDishesEntered++)
						{
							System.out.print("\n Enter the quantity of each dishes" );							
							dishesQuantity = input.nextInt();
							setTableRunningOrder(getTableRunningOrder);
						}
						}break;
						case 3:
					    {
						System.out.print("\n Do you want to delete the orders?" );
						}break;
						case 4:
						{
					    System.out.print("\n Please display the total bill" );
						}break;
						case 5:
						{
						
						}break;
				        case EXIT:
					    System.out.println("Thanks for coming.Have a nice day");
					    break;
				      
   					    default:		
				
			}	
		} while (choice !=6); 
		
	}
}

		
