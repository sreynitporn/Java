package Generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Util4 {
    public static void data(List<? super Number>List){
        System.out.println(List);
    }
    public static void main(String[] args){
        Util4.data(new ArrayList<Number>());
        Util4.data(new ArrayList<Serializable>());
    }
}
