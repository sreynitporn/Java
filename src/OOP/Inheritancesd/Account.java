package OOP.Inheritancesd;

import java.util.UUID;

public class Account {
    public final String uuid= UUID.randomUUID().toString();
    public String accountType;
    public Double amountOfCash=0.0;
    public Account(String accountType){

        this.accountType=accountType;
    }
     void deposit(Double amountOfCashDeposit){
       this.amountOfCash+=amountOfCashDeposit;
    }
    public void withdraw(double amountOfCashWithdraw){
        if(amountOfCash<amountOfCashWithdraw)
        {
            System.out.println("Your balance is lower than amount you withdraw");
        }else{
            this.amountOfCash-=amountOfCashWithdraw;
        }
    }
    public void showBalance(){
        System.out.println("your:"+this.amountOfCash+"Account type:"+this.accountType);
    }
}
