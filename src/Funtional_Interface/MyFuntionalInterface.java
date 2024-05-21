package Funtional_Interface;
@FunctionalInterface
public interface MyFuntionalInterface {
    void test();
}
class imp implements MyFuntionalInterface{

    @Override
    public void test() {
        System.out.println("hello world");
    }

}

