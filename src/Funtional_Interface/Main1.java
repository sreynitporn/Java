package Funtional_Interface;

import Arrays.Str;

public class Main1 {
    public static void main(String[] args){
        Provider provider=new Provider();
        MyInterface myInterface=Provider::Provider1;
        MyInterface myInterface1=provider::Provider2;
        MyInterface myInterface2=Provider::new;

        myInterface.test();
        myInterface1.test();
        myInterface2.test();

    }
}
