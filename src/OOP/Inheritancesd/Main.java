package OOP.Inheritancesd;

public class Main {
    public static void main(String[] args) {
        Functionalities savingAccount= new Account1("Savinng");
        savingAccount.deposit(5d);
        savingAccount.showBalance();
    }

}
