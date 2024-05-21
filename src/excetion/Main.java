package excetion;

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    private static void  insertAge() throws NumberValidatorExction{
        System.out.println("[+] insert age:");
        Integer age = new Scanner(System.in).nextInt();

        if(age<0){
            throw  new NumberValidatorExction("Age must bbe grate than 0");
        }
        System.out.println(STR."your age:\{age}");
    }
    public static void main(String[] args){
        while (true){
            try{
                insertAge();
            }catch (NumberValidatorExction exction){
                System.out.println(exction.getMessage());
            }
        }
    }
}
