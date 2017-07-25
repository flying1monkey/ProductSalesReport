import java.util.Scanner;

public class BasicReport {

	public static void main(String[] args) {
		otherMethod();
	}
	
	public static void otherMethod()
	{
		try
		{
		
		// TODO Auto-generated method stub
		//VERY LITTLE ERROR CHECKING DONE, ASSUMES CORRECT INPUT
		
		//Variables
		String shouldContinue="y";
		int custNum=0;
		String custName="";
		double saleAmt=0.00;
		int taxCode=0;
		double tax=0.00;
		double totalAmt;
		Scanner scan = new Scanner(System.in);
		
		//repeat as needed
		while(!shouldContinue.equalsIgnoreCase("n"))
		{
			//get initial info
//Query for customer number
			System.out.print("What is the customer's number? ");
			custNum=scan.nextInt();
			
//Query for customer name
			System.out.print("\nWhat is the customer's name? ");
			custName=scan.next();
			
//Query for sale amount
			System.out.print("\nWhat is the sales amount? ");
			saleAmt=scan.nextDouble();
						
//Query for tax code
			System.out.print("\nWhat is the tax code? ");
			taxCode=scan.nextInt();
			
//Calculate tax 			
			if(taxCode==1)
			{
				tax=saleAmt*.03;
			}
			else if(taxCode==2)
			{
				tax=saleAmt*.05;
			}
			else
			{
				tax=0.00; //all other cases, tax is 0. 
			}
//Calculate total amount
			totalAmt = saleAmt+tax;
			
//Print results
			System.out.println("SALES REPORT");
			System.out.printf("Detail: Customer number:%d. Customer name:%s. Sales amount:$%.2f. Sales tax:$%.2f. Total amount:$%.2f.%n", custNum, custName, saleAmt, tax, totalAmt);
			
//Ask if they want to start again			
			System.out.println("Do you want to run another report?");
			shouldContinue=scan.next();
			if(!shouldContinue.equalsIgnoreCase("y") && !shouldContinue.equalsIgnoreCase("n"))
			{
				//if not y or n, note error and reprompt
				while(!shouldContinue.equalsIgnoreCase("y") && !shouldContinue.equalsIgnoreCase("n"))
				{
					System.out.println("Not valid input.  Try again.");
					System.out.println("Do you want to run another report?");
					shouldContinue=scan.next();
				}
			}
		}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("You messed up somewhere. Start over. Try numbers this time. \n");
			otherMethod();
		}
	}
}
