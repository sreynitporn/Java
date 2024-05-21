package OOP.Inheritancesd;

import java.util.UUID;

interface Functionalities {
    void deposit(Double amountOfCashToDeposit);
    void withdraw(Double amountOfCashToDeposit);
    void showBalance();

}
 class Account1 implements Functionalities {
    private final String uuid = UUID.randomUUID().toString();
    private String accountType;
    private Double amountOfCash = 0.0;
     public Account1(String saving) {
     }

     @Override
    public void deposit(Double amountOfCashDeposit) {
        this.amountOfCash += amountOfCashDeposit;

    }

    @Override
    public void withdraw(Double amountOfCashWithdraw) {
        if(amountOfCash<amountOfCashWithdraw)
        {
            System.out.println("Your balance is lower than amount you withdraw");
        }else{
            this.amountOfCash-=amountOfCashWithdraw;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("your:"+this.amountOfCash+"Account type:"+this.accountType);

    }
}
