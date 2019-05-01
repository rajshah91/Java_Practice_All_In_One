/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author raj.shah
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] v = new String[]{"a", "b"};
        String[] b = v;
        v[0] = "c";
        v[1] = "d";

        System.out.println(v == b); //true since both is pointing to the same pointer
        Arrays.asList(v).stream().forEach(System.out::println);  // c d
        System.out.println("-------------------");
        Arrays.asList(b).stream().forEach(System.out::println);  // c d

        String[] v2 = new String[]{"a", "b"};
        change(v2);
        System.out.println("-------------------");
        Arrays.asList(v2).stream().forEach(System.out::println);

        //Here value of v2 remains unchanged 
        //because you only alter the local variable v, not the one in the calling method. 
        //You are changing the reference of the variable b, not manipulating the given array 
    }

    public static void change(String[] b) {
        String[] v = new String[]{"c", "d"};
        b = v;
        System.out.println(" b=v ?" +(b==v));
    }
}
