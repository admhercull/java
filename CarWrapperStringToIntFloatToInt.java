/*
In this code we illustrate creation of :
- an INTEGER VALUE FROM A STRING or
- a BOOLEAN VALUE FROM A STRING.
We can do it with the help of wrapper classes.

Syntax: Creation from other data types
    Integer hundred = Integer.valueOf("100");
    Boolean value = Boolean.valueOf("True");
*/

import java.io.*;

public class CarWrapperStringToIntFloatToInt {

    public static void main(String[] args) {

        // Conversion of float value to int
    Float floatWrap = Float.valueOf(45.158f);

    // Invoking the intValue() method over the stored float value to store
    int floatToInt = floatWrap.intValue();

    // Print the non-primitive(Integer) value
    System.out.println(floatToInt);

    // Now for another number N, say N = 5
    // Convert the binary number to the integer value
    Integer five = Integer.valueOf("101", 2);

    // Print the number
    System.out.println(five);

    }

}
