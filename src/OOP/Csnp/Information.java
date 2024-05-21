package OOP.Csnp;

public class Information extends Nit {
    private int year;
    public Information(){
        super();
        this.year=5;
    }
    public Information(String gender,int year){
        super(gender);
        this.year=year;
    }
    public void display() {
        super.display(); // Invoking the display() method of the superclass (Vehicle)
        System.out.println("Number of Year: " + year);
    }
}
