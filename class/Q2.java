class account {
    int accountNumber ;
    double balance;
    void depoist(double amount){
         balance = balance+amount;
    }
    void withdraw (double amount){
        if(balance>=amount){
            balance = balance-amount;
        } else {
            System.out.println("Insufficient balance");
        }
        
    }
    void viewBalance(){
        System.out.println("Your account balance is: "+balance);
    }
}

class Q2 {
    public static void main(String[] args) {
        account a1 = new account();
        a1.depoist(230);
        a1.viewBalance();
        a1.withdraw(250);
        a1.viewBalance();
    }
}