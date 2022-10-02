package MyFirstJavaproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Inputs {
	
	public static void main(String[] args) {
		
		// Gets user First name
		System.out.print("Enter your First Name: ");
		Scanner FirstName = new Scanner(System.in);
		String  FN = FirstName.nextLine();
		
		// Gets user Last name
		System.out.print("Enter your Last Name: ");
		Scanner LastName = new Scanner(System.in);
		String  LN = LastName.nextLine();
		
		
		
		// Gets Total Income
		System.out.print("Enter your Total Income for the Year: ");
		Scanner T_Income = new Scanner(System.in);
		String  TotalIncome = T_Income.nextLine();
		double  IncomeTYD = Double.parseDouble(TotalIncome);
		
		// Get the retained Federal Taxes
		System.out.print("How much of Federal Tax was retained during the year:");
		Scanner FT_Deduct = new Scanner(System.in);
		String  FTotalDeduct= FT_Deduct.nextLine();
		double  FDeductTYD = Double.parseDouble(FTotalDeduct);
		
		// Get the retained State Taxes
		System.out.print("How much of State Tax was retained during the year:");
		Scanner ST_Deduct = new Scanner(System.in);
		String  STotalDeduct= ST_Deduct.nextLine();
		double  SDeductTYD = Double.parseDouble(STotalDeduct);
		
		// create a list of dependent's names
		ArrayList<String>  Dependent  = new ArrayList<String>();

		System.out.println("How many dependent do you have?");
		Scanner A = new Scanner(System.in);
		String X = A.nextLine();
		int Y = Integer.parseInt(X);
		
		for (int i = 1; i <= Y; ++i) {
			System.out.print("Enter dependent name: ");
			Scanner Depen = new Scanner(System.in);
			String D = Depen.nextLine();
			Dependent.add(D);
		}
		

		
		// Gets Taxable income by subtracting standard deduction
		double Taxable = IncomeTYD - 12200;
		
		// Call class and runs methods 
		TaxBrake Rate = new TaxBrake(Taxable);
		double RetainedTaxes =  FDeductTYD + SDeductTYD;
		double SRate = Rate.getState();
		double FRate = Rate.getFed();
		
		
		//Calculate 
		double DepDeduc = Dependent.size();
		double DepCredit = DepDeduc * 1500;
		double State = SDeductTYD * SRate;
		double Federal = FDeductTYD * FRate;
		double Return = RetainedTaxes - State -Federal - DepCredit;
		
	
		//Printing Final Results
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Your Gross Income was: " + IncomeTYD);
		System.out.println("The amount of Retained Taxes was: " + RetainedTaxes);
		System.out.println("Your Taxable Income was: " + Taxable);
		System.out.println("Your State Taxes was: " + State);
		System.out.println("Here is your dependent list: "+ Dependent);
		System.out.println("Your total dependent credit is: " + DepCredit);
		
		System.out.println("Your Federal Taxes was: " + Federal);
		
		// Calculate Refund or Payment
		if (Return >= 0) {
			
			System.out.println("Your Refund is: " + Return);
			
		}
		else {
			Return = Return * -1;
			System.out.println("The amount due is: " + Return);

		}
		
}
	
	}

