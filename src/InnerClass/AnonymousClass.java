package InnerClass;

import java.util.List;
import java.util.Objects;

public class AnonymousClass {
    public List<Objects>getAllUser(){
        System.out.println("This is non-anonymous class");
        return null;
    }

    public static void main(String [] args){
        AnonymousClass anonymousClass= new AnonymousClass();
        anonymousClass.getAllUser();
        AnonymousClass anonymousClass1=new AnonymousClass(){
            @Override
            public List<Objects> getAllUser() {
                return super.getAllUser();
            }
        };
        anonymousClass1.getAllUser();
    }
}
