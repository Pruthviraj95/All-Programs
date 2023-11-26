import java.lang.* ;
class SavingAccount{
	
	static double inter;
	double accbal;
	SavingAccount(double a){
		accbal=a;
		}
	double Monthly(){
		return (accbal*inter/100)/12;
		}
	double nxtmonth(){
		return accbal+Monthly();
		}
	public static double setinter(double x){
		inter=x;
		return inter;
	}
	
}
class Bank
{
	public static void main(String[] arug){
		
		
		SavingAccount.setinter(4);
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		
		
		System.out.println("Monthly intrest for 4% is "+saver1.Monthly());
		System.out.println("Monthly intrest for 4% is "+saver2.Monthly());
		System.out.println("\n");
		
		
		
		
		System.out.println("Balance of saver1 for 4% is "+saver1.nxtmonth());
		System.out.println("Balance of saver2 for 4% is "+saver2.nxtmonth());
		System.out.println("\n");
		
		
		
		
		SavingAccount.setinter(5);
	    System.out.println("Monthly intrest for 5% is "+saver1.Monthly());
		System.out.println("Monthly intrest for 5% is "+saver2.Monthly());
		System.out.println("\n");
		
		
		
		
		System.out.println("Balance of saver1 for 5% is "+saver1.nxtmonth());
		System.out.println("Balance of saver2 for 5% is "+saver2.nxtmonth());
	}
}