package Project.Hw;
 class MathSolverImp implements MathSolver {
    @Override
    public void sum(Integer...number) {
        Integer s=0;
        for(Integer num:number){
            s+=num;
        }
        System.out.println("result sum:"+s);
    }

    @Override
    public void subtract(Integer a, Integer b) {
        Integer sub=a-b;
        System.out.println("result sub:"+sub);

    }

    @Override
    public void multiply(Integer a, Integer b) {
        Integer multi=a*b;
        System.out.println("result Multi:"+multi);
    }

}
