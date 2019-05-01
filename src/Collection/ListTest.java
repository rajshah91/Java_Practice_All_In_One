/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author raj.shah
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Map<String, String> dataDictionary = new LinkedHashMap<>();
        dataDictionary.put("industryCodes", null);
        dataDictionary.values().removeIf(Objects::isNull);
        list.add(6);
        List<Integer> umlist=Collections.unmodifiableList(list);
        list.add(7);
//        umlist.add(777);
        list.stream().forEach(System.out::println);
        umlist.stream().forEach(System.out::println);
    }

    
}
