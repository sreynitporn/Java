package constrctors;

public class copyConstructor {
        // data members of the class.
        String name;
        int id;
        // Parameterized Constructor
        copyConstructor(String name, int id)
        {
            this.name = name;
            this.id = id;
        }
        // Copy Constructor
        copyConstructor(copyConstructor obj2)
        {
            this.name = obj2.name;
            this.id = obj2.id;
        }
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        copyConstructor obj1 = new copyConstructor("nana", 68);
        System.out.println("Name :" + obj1.name);
        System.out.println("id:"+ obj1.id);
        System.out.println();
        // This would invoke the copy constructor.
        copyConstructor obj2 = new copyConstructor(obj1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name :" + obj2.name);
        System.out.println("id:"+ obj2.id);
    }
}