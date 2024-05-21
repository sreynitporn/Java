import java.util.Scanner;

public class cas {
    public static void main(String[] args){
      /*  System.out.println("Insert age:");
        Integer age= new Scanner(System.in).nextInt();
        int a =switch (age){
            case 18,20->age;
            case 3 ->{
                yield 3;
            }
            default->0;
        };
        System.out.println("My age:"+a);*/
        Character a = 'A';
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception exception){}
            System.out.print(a+" ");
            a++;

        }
    }
}
