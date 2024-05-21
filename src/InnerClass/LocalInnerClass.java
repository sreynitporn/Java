package InnerClass;

public class LocalInnerClass {
    public void details(){
        class Music{
            public void compose(){
                System.out.println("Song is composed");
            }
        }
        Music music= new Music();
        music.compose();
    }
    public static void main(String[] args){
        LocalInnerClass localInnerClass= new LocalInnerClass();
        localInnerClass.details();
    }
}
