package Funtional_Interface;
@FunctionalInterface
public interface Guess {
    void test(String name);
    public static void main(String[] args){
        Guess guess=(e)->
                System.out.println("hello: "+e);
        guess.test("koko");
    }
}

