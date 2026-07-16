//  encapsulation
package study.oops;

class encapsulation{
    public static  void main(String[] args){
        Bank obj = new Bank();
        obj.setName("Ambrish");
        obj.deposit(5000);
        obj.withdraw(1000);
        System.out.println(obj.getName());
        System.out.println(obj.showBalance());
        obj.showBalance2();
    }
}

class Bank{
    private String name; 
    private int balance; 
    
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Amount cannot be eqal or less than zero");
        }
    }
    void withdraw(int amount){
        if(amount<balance && amount>0){
            balance-=amount;
        }else{
            System.out.println("Amount cannot be greater than balance");
        }
    }
    int showBalance(){
        return balance;
    }
    void showBalance2(){
        System.out.println(balance);
    }
    
}
