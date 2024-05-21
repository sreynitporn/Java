package Generic;

import lombok.Data;

@Data
class Util <T>{
    private T data;

    public static void main(String[] args){
        Util<String> util=new Util<>();
        util.setData("Domain");
        System.out.println(util);
        Util<Integer>util1=new Util<>();
        util1.setData(123);
        System.out.println(util1);
    }
}
