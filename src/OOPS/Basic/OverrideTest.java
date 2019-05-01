/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Basic;

import java.util.LinkedHashMap;

public class OverrideTest {

    public static void main(String args[]) {
        Base obj = new Derived();
//        obj.display();
        obj.print();
        obj.methodFromBase();
        
        Derived obj1=new Derived();
//        obj1.display();

        obj1.print();
        obj1.methodFromBase();
        obj1.methodFromDerived();
        
        Derived.displayPublic();
        Base.displayPublic();
        Derived.OverloadedStaticDisplayMethod("Hello");
        
    }
}

class Base {

    private static void display() {
        System.out.println("Static class private method from Base");
    }
    
    public static void displayPublic() {
       System.out.println("Static class public method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }
    
    public void methodFromBase() {
        System.out.println("instance method from Base");
    }
}

class Derived extends Base {

    private static void display() {
        System.out.println("Static class private method from Derived");
    }
    
    public static void displayPublic() {
        System.out.println("Static class public method from Derived");
    }
    
    public static void OverloadedStaticDisplayMethod(String name) {
        System.out.println("Static class Overloaded static public method from Derived    : " + name);
    }

    @Override
    public void print() {
        System.out.println("Non-static or instance method from Derived");
    }
    
    public void methodFromDerived() {
        System.out.println("instance method from Derived");
    }
}
