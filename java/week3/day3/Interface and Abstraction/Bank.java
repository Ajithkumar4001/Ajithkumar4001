import week3.day3.CIBIL;
import week3.day3.PNB;
import week3.day3.SBI;

public class Bank extends SBI implements CIBIL,PNB{
	public void maximumLoanAmount() {
		System.out.println("Maximum Loan Amount is = 25,00,000");
	}

	public void creditScore() {
		System.out.println("Credit Score = 5");
	}

	public void minimumBalance() {
		System.out.println("Minimum Balance Is Required = 10000");
	}

	public void cibilScore() {		
		System.out.println("CibilScore is = 50");
	}

	@Override
	public void bankBalance() {
		System.out.println("Bank Balance = 1000");
	}

	@Override
	public void maximumLoanAmount2() {
		System.out.println("MinimumLoan Amount = 2,00,000");
	}
	public static void main(String[] args) {
//		Bank obj=new Bank();
//		obj.bankBalance();
//		obj.cibilScore();
//		obj.creditScore();
//		obj.ITLoan();
//		obj.maximumLoanAmount();
//		obj.minimumBalance();
//		obj.minimumBalance();
//		obj.maximumLoanAmount2();
//		
		SBI obj1=new Bank();
		obj1.bankBalance();
		obj1.ITLoan();
		obj1.maximumLoanAmount2();
		
		PNB obj2=new Bank();
		obj2.creditScore();
		obj2.maximumLoanAmount();
		obj2.minimumBalance();
		
		CIBIL obj3=new Bank();
		obj3.cibilScore();
		
	}

	
}
/////
