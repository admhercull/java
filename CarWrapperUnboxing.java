/*
UNBOXING: 
It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example 
– conversion of Integer to int, 
- Long to long, 
- Double to double ... etc
*/

public class CarWrapperUnboxing {
    
    public static void main(String[] args)
    {
        Character carColor = 'a';
  
        /*
        Unboxing- OBJECT TO PRIMITIVE conversion. For example 
        – conversion of Integer to int,
        - Long to long, 
        - Double to double ... etc)
        */ 
        char a = carColor;
    
        // printing the values from object
        System.out.println(a);
    }

}
