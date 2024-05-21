package OOP.Csnp;

public class Nit {
    String gender;
    public Nit(){
        this( "Unknown");
    }
    public Nit(String gender){
        this.gender=gender;
    }
    public void display(){
        System.out.println("gender:"+gender);
    }
}


