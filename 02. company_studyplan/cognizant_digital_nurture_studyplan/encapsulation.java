
public class encapsulation{
    public static void main(String[] args){
        
        BankAccount obj = new BankAccount();
        
        obj.setAccountHolder("krishnaa");
        obj.deposit(5000);
        obj.withdraw(1000);
        
        System.out.println("Account Holder Name :"+obj.getAccountHolder());
        System.out.println("Balance Amount      :"+obj.balance());
    }
}

class BankAccount{
    
    private String AccountHolder;
    private double balance;
    
    void setAccountHolder(String AccountHolder){
        this.AccountHolder=AccountHolder;
    }
    String getAccountHolder(){
        return AccountHolder;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
    }
    double balance(){
        return balance;
    }
}

