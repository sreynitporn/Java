package InnerClass;

interface AbstractionConcept {
    abstract void uploadFile();
}
class AbstractionImp implements AbstractionConcept{
    @Override
    public void uploadFile() {
        System.out.println("File has been uploaded successfully.");
    }
}

