package Generic;

public class Test1 {
    public static <T> void data(T a){
        System.out.println(a);
    }
    public static  void main(String[] args){
        Test1.data(12);
        Test1.<String>data("Hello");
    }
}
