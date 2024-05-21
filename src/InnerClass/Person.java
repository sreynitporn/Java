package InnerClass;

public interface Person {
    public class Example {
        public static void main(String[] args) {
            // Creating an anonymous inner class that extends the Thread class
            Thread thread = new Thread() {
                public void run() {
                    System.out.println("Thread is running");
                }
            };

            // Starting the thread
            thread.start();
        }
    }


}


