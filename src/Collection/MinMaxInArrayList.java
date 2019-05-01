/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author raj.shah
 */
public class MinMaxInArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> al= Arrays.asList(1,2,5,7,0,10,-4,37);
        int max=Collections.max(al);
        int min=Collections.min(al);
        System.out.println("Min = "+min +" Max = "+max);
        
        al.stream().mapToInt(m -> m).max().ifPresent(x -> { System.out.println("Max value = "+x);});
        al.stream().mapToInt(m -> m).min().ifPresent(x -> { System.out.println("Min value = "+x);});
        
        al.stream().filter(a -> a== 5).findFirst().ifPresent(x -> {System.out.println("Given value is Present in the list");});
        
        
        MinMaxInArrayList mm=new MinMaxInArrayList();
        MinMaxInArrayList.m1();
        mm.m2();
        
    }
    
    public  static void m1(){
        System.out.println("static m1 method");
        new MinMaxInArrayList().m2();
    }
    
    public void m2(){
        System.out.println("non static method m2 calling to static method m1");
//        m1();
    }
}
