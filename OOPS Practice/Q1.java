

class BankAccount {
    String AccountNumber;
    String Name;
    Double Balance;
public BankAccount( String AccountNumber,  String Name,  Double Balance){
    this.AccountNumber=AccountNumber;
    this.Balance=Balance;
    this.Name=Name;
}
   void deposit(double amount){
     System.out.println("The Deposited amount is  is: "+  amount);
        Balance=Balance+amount; 
        System.out.println("The account balance is: "+ Balance );
   }
   void withdrawal(double amount){
   if(amount>Balance){
    System.out.println("Insufficent balance");
   }else{
    Balance= Balance-amount;
    System.out.println("Withdrawan: "+amount);
    System.out.println("The account balance is: "+ Balance );
   }
   }
   void displayAccountInfo(){
   System.out.println("The name is "+Name);
   System.out.println("Account number is"+ AccountNumber);
   System.out.println("Balance is"+Balance);
   }
}
public class Q1 {

    public static void main(String[] args) {
        BankAccount B1= new BankAccount("123ER","Aswath",0.0);
        BankAccount B2= new BankAccount("123E2","Pradeep",0.0);

        System.out.println("=== Initial Accounts ===");
        B1.displayAccountInfo();
        B2.displayAccountInfo();

        System.out.println("=== Transactions ===");
        B1.deposit(2000.00);
        B2.deposit(3000.00);

        B1.withdrawal(200.00);
        B2.withdrawal(200.00);
    }
}
