package acesseModifier;

public class callMethode {
    static final String[] names ={"Koko","Nana","Satya"};
    static void findByName(String name){
        for(String n: names){
            if(n.equalsIgnoreCase(name)){
                System.out.println("Name found:"+name);
                break;
            }
            else {
                System.out.println("Not found:"+name);
            }break;
        }
    }
    public static void main(String[] args){
        findByName("Nana");
        findByName("KJh");
    }
}
