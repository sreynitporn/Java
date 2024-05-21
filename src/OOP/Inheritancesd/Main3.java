package OOP.Inheritancesd;

public class Main3 {
    public static void main(String[] args){
        Account savingAccount = new Account ("Saving");
        savingAccount.deposit(5d);
        savingAccount.withdraw(2d);
        savingAccount.showBalance();
    }
}
