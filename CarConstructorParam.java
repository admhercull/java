// Java Program to Illustrate Working of
// Parameterized Constructor
  
// Importing required inputoutput class
import java.io.*;
  
// Class 1
class CarConstructorParam {
    // data members of the class.
    String name;
    int id;
  
    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    CarConstructorParam(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

class TestCarConstructorParam {
    // main driver method
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        CarConstructorParam carp1 = new CarConstructorParam("adam", 1);
        System.out.println("CarPName :" + carp1.name + " and CarPId :" + carp1.id);
    }
}
