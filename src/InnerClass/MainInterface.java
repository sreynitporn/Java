package InnerClass;

public class MainInterface {
    public static void main(String[] args){
        InterfaceWithAnonymouse interfaceWithAnonymouse= new InterfaceWithAnonymouse() {
            @Override
            public void uploadFile() {
                System.out.println("File added successfully");
            }
        };
        interfaceWithAnonymouse.uploadFile();
    }
}
