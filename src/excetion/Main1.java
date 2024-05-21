package excetion;

import java.util.Scanner;

public class Main1 {
    private static boolean isEmail(String email) throws EamilValidatorExcption{
        if(!email.contains("@")){
            throw new EamilValidatorExcption("Is not an email:");
        }
        return true;
    }
    public static void main(String[] args){
        try {
            System.out.print("[+] insert email:");
            String email=new Scanner(System.in).nextLine();
            System.out.println("Is an email: " + isEmail(email));
        }catch (EamilValidatorExcption eamilValidatorExcption){
            System.out.println(eamilValidatorExcption.getMessage());
        }
    }
}
