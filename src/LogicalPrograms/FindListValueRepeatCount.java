/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicalPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author raj.shah
 */
public class FindListValueRepeatCount {

     public static void main(String[] args) {
       List<String> list=Arrays.asList("Raj","Puja","Neel","Kedar","Rupal","Anant","Jimmy","Puja","Raj","Jayesh","Raj");
       Set<String> set= new LinkedHashSet<>();
       set.addAll(list);
       
       // 1st way
       set.stream().map(a-> list.stream().filter(b -> b.equalsIgnoreCase(a)).count()).forEach(System.out ::println);
       
       //2nd way
       Map<String,Integer> map=new HashMap<>();
       for(String str : list){
           if (map.containsKey(str)){
               map.put(str,(map.get(str)+1));
           }else{
               map.put(str, 1);
           }
       }
       
       System.out.println("Map :"+ map);
       
       //if we are said to stop on first repeat element found then do following 
       Map<String,Integer> map1=new HashMap<>();
       for(String str : list){
           if (map1.containsKey(str)){
               System.out.println("Value being duplicated for Name : "+str);
               break;
           }else{
               map1.put(str, 1);
           }
       }
       
    }
    
}
