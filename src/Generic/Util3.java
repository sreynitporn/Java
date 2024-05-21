package Generic;

public class Util3 {
    public <T extends Number>double sum(T...numbers){
        double sum=0;
        for (T t:numbers){
            sum+=t.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args){
        Util3 util3=new Util3();
        System.out.println((int)util3.sum(1,2,2));
        System.out.println((double)util3.sum(1.2,3.12));
    }
}
