package Try_Catch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String name;
        try{
            System.out.println("Insert name:");
            name=new Scanner(System.in).nextLine();
            int [] numbers ={0,1,2,3,4,5,6,7,8,9};
            for(int n:numbers){
                if(name.contains(String.valueOf(n)))
                    throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("Invalid name,please input again:");
        }
    }
}
