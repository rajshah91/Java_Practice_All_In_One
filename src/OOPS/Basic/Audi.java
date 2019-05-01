/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Basic;

class Car {

    public void run() {
        System.out.println("I AM FROM Car class.");
    }

    public void makeNoise() {
        System.out.println("I AM FROM Car class makeNoise method.");
        myPrivateMethod();
    }

    private void myPrivateMethod() {
        System.out.println("I am from Car's private method. ");
    }
}

public class Audi extends Car {

    @Override
    public void run() {
        System.out.println("I am from Audi class");
    }

    private void myPrivateMethod() {
        System.out.println("I am from Audi's private method. ");
    }

    public void myPublicMethod() {
        System.out.println("I am from Audi's public method. ");
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.run();
        c.makeNoise();
        // c.myPrivateMethod();   not accesible
        // c.myPublicMethod();    not accesible

        Car c1 = new Audi();  //upcasting
        c1.run();
        c1.makeNoise();
        // c1.myPrivateMethod();   not accesible
        // c1.myPublicMethod();    not accesible

        // incompatible types : car can't be converted to Audi
        //Audi a1=new Car(); 
        Audi a = new Audi();
        a.run();
        a.makeNoise();
        a.myPrivateMethod();
        a.myPublicMethod();
    }

}
