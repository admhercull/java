/* CONSTRUCTOR CHAINING is the process of calling one constructor from 
another constructor with respect to current object.
done in two ways: 
- Within same class: It can be done using this() keyword for constructors in same class
- From base class: by using super() keyword to call constructor from the base class.
*/

public class CarChainingConstructor {
    
    // default constructor 1 (no params)
    // default constructor will call another constructor
    // using this keyword from same class
    CarChainingConstructor()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor 1");
    }

    // parameterized constructor 2
    CarChainingConstructor(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println("The Parameterized constructor 2");
    }

    // parameterized constructor 3
    CarChainingConstructor(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new CarChainingConstructor();
    }
}    

}
