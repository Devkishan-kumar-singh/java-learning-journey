// Account management system
class Account { 
    private int accNo; 
    private int balance; 
    private int timeperiod; 
    private static double interest = 0.075; 

 
    Account(int accNo, int balance, int timeperiod) { 
        this.accNo = accNo; 
        this.balance = balance; 
        this.timeperiod = timeperiod; 
    }

    
    public double calculateInterest() { 
        return balance * interest * timeperiod; 
    } 

   
    public void showAccDetails() {
        System.out.println("Account Details :-");
        System.out.println("Account Number: " + accNo);
        System.out.println("Current Balance:" + balance);
        System.out.println("Time Period: " + timeperiod + " years");
        System.out.println("Interest Rate: " + (interest * 100) + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
		System.out.println();
    }

    
    public static void changeIntRate(double newRate) {
        interest = newRate;
    }
}
public class AccountMain{
	public static void main(String args[]){
		Account a[] = new Account[3];
		a[0]= new Account(12345678,10000,2);
		a[1]= new Account(87654321,40000,2);
		a[2]= new Account(43218765,30000,2);
		System.out.println("Details of account holder At 7.5% interest rate"); 
		
		for (int i =0 ;i<a.length;i++) {
            a[i].showAccDetails();
        }
		Account.changeIntRate(0.085);
		System.out.println("Details of account holder At updated 8.5% interest rate");
		for (int i =0 ;i<a.length;i++) {
            a[i].showAccDetails();
        }
	}
}
		
 
	