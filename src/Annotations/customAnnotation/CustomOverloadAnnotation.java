package Annotations.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

///////////////////////////////////////////////////

@Target(value=ElementType.METHOD)
@interface Overload {

}
/////////////////////////////////////////////////////
@SupportedAnnotationTypes("Annotations.customAnnotation.Overload")
class OverloadProcessor extends AbstractProcessor{

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // TODO Auto-generated method stub
        HashMap<String, Integer> map = new HashMap<>();

        for(Element element : roundEnv.getElementsAnnotatedWith(Overload.class)){
            String signature = element.getSimpleName().toString();
            int count = map.containsKey(signature) ? map.get(signature) : 0;
            map.put(signature, ++count);
        }

        for(Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                processingEnv.getMessager().printMessage(Kind.ERROR, "The method which signature is " + entry.getKey() +  " has not been overloaded");
            }
        }
        return true;
    }
}

public class CustomOverloadAnnotation {
    @Overload
    public static void foo(){
    }

    @Overload
    public static void foo(String s){

    }

    @Overload
    public static void nonOverloadedMethod(){

    }
    
    /*
    
    After packaging annotation and its process into a jar file, create a class with @Overload and use javac.exe to compile it.
    
    Since nonOverloadedMethod() has not actually been overloaded, we will get the output like below:
    
    The method which signature is nonOverloadedMethod  has not been overloaded
    */
}
