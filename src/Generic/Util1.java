package Generic;

public class Util1<T extends Number> {
    public double sum(T...numbers){
        double sum =0;
        for(T t:numbers){
            sum+=t.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args){
        Util1<Integer> util=new Util1<>();
        System.out.println((int)util.sum(1,2,2));
        Util1<Double>util1=new Util1<>();
        System.out.println(util1.sum(1.2,3.12));
    }
}
