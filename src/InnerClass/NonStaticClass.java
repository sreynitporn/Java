package InnerClass;

public class NonStaticClass {
    public class CurrencyExchange{
        public void fromRielToDollar(float riel){
            System.out.println("This is Riel:"+riel/4000);
        }
        public void fromDollarToRiel(float dollar){
            System.out.println("This is Dollar:"+dollar*4000);
        }
        static class  MathHelper{
            public void fineMax(int a,int b){
                System.out.println("This is max:"+Math.max(a,b));
            }
        }
    }
    public static void main(String[] args){
        NonStaticClass nonStaticClass= new NonStaticClass();
        NonStaticClass.CurrencyExchange currencyExchange= nonStaticClass.new CurrencyExchange();
        currencyExchange.fromRielToDollar(2000);
        currencyExchange.fromDollarToRiel(4);
    }
}
