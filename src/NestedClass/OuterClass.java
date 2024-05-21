package NestedClass;

public class OuterClass {
    static class MathInner{
        public void fineMax(int a,int b){
            System.out.println("This is max:"+Math.max(a,b));
        }

    }
    public static void main(String[] args){
        OuterClass.MathInner mathInner= new OuterClass.MathInner();
        mathInner.fineMax(6,9);
    }

}
