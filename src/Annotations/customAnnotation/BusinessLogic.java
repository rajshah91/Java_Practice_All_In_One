package Annotations.customAnnotation;

import java.lang.annotation.Documented;

/**
 *
 * @author raj.shah
 */
//https://dzone.com/articles/how-annotations-work-java
//https://howtodoinjava.com/java/annotations/complete-java-annotations-tutorial/
public class BusinessLogic {
    public BusinessLogic() {
        super();
    }
    public void compltedMethod() {
        System.out.println("This method is complete");
    }    
    
    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    }
    
    @Todo(priority = Todo.Priority.MEDIUM, author = "Uday", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED )
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    }
}
