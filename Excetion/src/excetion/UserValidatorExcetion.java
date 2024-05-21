package excetion;

public class UserValidatorExcetion extends Exception{
    public UserValidatorExcetion(){
        super();
    }
    public UserValidatorExcetion(String message){
        super(message);
    }
}
