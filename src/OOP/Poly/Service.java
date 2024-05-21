package OOP.Poly;

public class Service {
    void perForm(){};
}
class ServiceImp1 extends Service {
    @Override
    void perForm() {
        System.out.println("The perform ServiceImp1.");
    }
}
class ServiceImp2 extends Service{
    @Override
    void perForm() {
        System.out.println("The perform ServiceImp2.");
    }
}
