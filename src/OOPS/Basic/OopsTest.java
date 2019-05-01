/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Basic;

/**
 *
 * @author raj.shah
 */
 class OopsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Base1 obj1 = new Derived1();
        Base1 obj2 = new Base1();
        Derived1 d1=new Derived1();
        
        
//        obj1.display();
        obj1.print();
        
        
//        obj2.display();
        obj2.print();
        
        d1.print();
        
        ///////// Important //////////
        
        obj1.display2();// Like C++, when a function is static, runtime polymorphism doesn't happen.
        obj2.display2();
        d1.display2();
        
    }

}

class Base1 {

    private static void display() {
        System.out.println("Static class method from Base");
    }
    
    public static void display2() {
        System.out.println("Static  class method from Base");
    }

    public void print() {
        System.out.println("Non-static  instance method from Base");
    }
}

class Derived1 extends Base1 {

    private static void display() {
        System.out.println("Static  class method from Derived");
    }
    /////imp
    public static void display2() {
        System.out.println("Static class method from Derived");
    }

    @Override
    public void print() {
        System.out.println("Non-static instance method from Derived");
    }
}
