/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicalPrograms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author raj.shah
 */
public class FindStringLenghForWholeList {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("Raj","Puja","Neel","Kedar","Rupal","Anant","Jimmy");
        list.stream().mapToInt(s -> s.length()).forEach(System.out :: println);
        
     }
    
}
