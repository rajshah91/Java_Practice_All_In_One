/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author raj.shah
 */
public class RemoveStringFromList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> list1=new ArrayList(Arrays.asList("AA","BB","AA","AA","AA","BB"));
        List<String> list2=new ArrayList();
        
        //way-1
        list2=list1.stream().filter(a -> !a.equals("BB")).collect(Collectors.toList());
        System.out.println(list2);
        
        //way-2
        list1.removeIf(a -> a.equals("BB"));
        System.out.println(list1);
    }
    
}
