/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Static;

/**
 *
 * @author raj.shah
 */
public class ParentChildStaticMethodTest {

    public static void main(String[] args) {
        Parent.parentMethod();
        Child.parentMethod();
        Child.childMethod();
        new Child().parentMehod();
    }
    
}

class Parent{
    public static void parentMethod(){
        System.out.println("I am from parent class static method");
    }
    
    /* Below code will give error : "method parentMethod is already defined in class Parent"
    ******************************************************************************************
    So it means this is method overloading and point to note here is that 
    method overloading does not check for static/non-static type or method return type 
    ******************************************************************************************
    public void parentMethod(){
        
    } 
    
    */
}

class Child extends Parent{
    
    public static void parentMethod(){
        System.out.println("I am from child class static method of parent *************");
    }
    
    public static void childMethod(){
        System.out.println("I am from child class static method");
    }
    
    /* Below code will give error : "method childMethod is already defined in class child"  
    
    public  void childMethod(){
        System.out.println("I am from child class static method");
    }
    
    */
    public void parentMehod(){
        System.out.println("I am from child class non-static method of parent *************");
    }
}
