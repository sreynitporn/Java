package OOP;
// Sub class Car extending vehicle
public class Car extends Vehicle {
    int maxSpeed = 180;
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                + super.maxSpeed);
    }

}

