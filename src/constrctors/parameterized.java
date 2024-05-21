package constrctors;

public class parameterized {
    // data members of the class.
    String name;
    int id;
    parameterized(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        parameterized parameter1 = new parameterized("nana", 68);
        System.out.println("Name :" + parameter1.name);
        System.out.println("Id :"+ parameter1.id);
    }
}
