/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author raj.shah
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = Arrays.asList("Raj", "Anant", "Kedar", "Jimmy", "Puja");

        for (String name : list) {
            System.out.println("Name :" + name);
        }
        
        list.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });
        
        list.forEach((final String name) -> {
            System.out.println(name);
        });
        
        list.forEach(System.out :: println);
        
        list.stream().map(m->m.toUpperCase()).forEach(System.out :: println);
        
     
//       long count=list.stream().filter(name -> name.contains("a")).count();
//        System.out.println("Count : "+count);
    }

}
