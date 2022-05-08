/* 
A constructor in Java is a special METHOD that is used to INITIALIZE OBJECTS.
The constructor is CALLED WHEN AN INSTANCE OF THE CLASS IS CREATED. 
It can be used to SET INITIAL VALUES for object attributes. 
Every time an object is created using the new() keyword, at least one constructor is called.
*/

import java.io.*;

class CarConstructorNoParam {
    int num;
    String name;
  
    // this would be invoked while an object
    // of that class is created.
    CarConstructorNoParam() {
        System.out.println("Constructor called");
    }
}
  
// main driver method
class TestConstructorNoParam {
    public static void main(String[] args)
    {
        // this would invoke default constructor
        CarConstructorNoParam car1 = new CarConstructorNoParam();
        CarConstructorNoParam car2 = new CarConstructorNoParam();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(car1.name);
        System.out.println(car1.num);
        System.out.println(car2.name);
        System.out.println(car2.num);

    }
}
