/* 
In this code, introduce the concept of Wrapper 
Wrapper class is a CLASS whose object wraps or CONTAINS PRIMITIVE DATA TYPES.
A wrapper class wraps (encloses) around a primitive data type and gives it an OBJECT APPEARANCE.
Wrapper classes are FINAL and IMMUTABLE.
*/

/*
- METHOD ARGS: Wrappers CONVERT PRIMITIVE DATA TYPES INTO OBJECTS. Objects are needed if we wish to modify 
the arguments passed into a method (because primitive types are passed by value).
- CLASSES IN java.util : classes in java.util package HANDLES ONLY OBJECTS and hence WRAPPER CLASSES HELP 
in this case also.
- DATA STRUCTURES storing OBJECTS ONLY DATA STRUCTURES in the Collection framework, such as ArrayList and Vector, STORE ONLY OBJECTS 
(reference types) and NOT PRIMITIVE TYPES.
- An OBJECT IS NEEDED to support SYNCHRONIZATION in MULTITHREADING.
*/
import java.util.ArrayList;

class CarWrapperAutoboxing {
    
    public static void main(String[] args)
    {
        char carColor = 'a';
  
        /*
        Autoboxing- PRIMITIVE TO Character object conversion. For example 
        – conversion of int to Integer, 
        - long to Long, 
        -double to Double ... etc)
        */ 
        Character a = carColor;
  
        ArrayList<Character> arrayList = new ArrayList<Character>(4);
  
        // Autoboxing because ArrayList stores only objects
        arrayList.add('b');
  
        // printing the values from object
        System.out.println(arrayList.get(0));
    }

}
