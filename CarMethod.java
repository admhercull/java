/* in this code, I introduce Java METHOD concept (PACKAGES and EXCEPTIONS reminders); A method in Java or Java Method is a collection of statements that 
- perform some specific task and 
- return the result to the caller.
NOTE: A Java method can perform some specific task without returning anything.
IMPORTANT: Methods in Java allow us to reuse the code without retyping the code.*/

/*
In general, method declarations has six components :  

1. ACCESS MODIFIER: It defines the access type of the method i.e. from where it can be accessed in your application. 
In Java, there 4 types of access specifiers. 
    public: It is accessible in ALL CLASSES in your application.
    protected: It is accessible within the CLASS IN WHICH IT IS DEFINED and in ITS SUBCLASS/ES
    private: It is accessible only within the CLASS IN WHICH IT IS DEFINED.
    default: It is declared/defined without using any modifier. It is accessible within the 
    SAME CLASS and SAME PACKAGE within which its class is defined.
    
    Java Package: Package in Java is a mechanism to encapsulate 
    - a group of classes, 
    - sub packages and 
    - interfaces. 
    A package is a container of a group of related classes where 
    some of the classes are accessible are exposed and others are kept for internal purpose

2. The RETURN TYPE: The data type of the value returned by the method or void if does not return a value.
3. Method Name: the rules for field names apply to method names as well, but the convention is a little different.
4. PARAMETERS LIST: Comma-separated list of the input parameters is defined, preceded with their data type, within the enclosed parenthesis. 
    If there are no parameters, you must use empty parentheses ().
5. EXCEPTIONS LIST: The exceptions you expect by the method can throw, you can specify these exception(s).
6. Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.

METHOD SIGNATURE
It consists of the 
- METHOD NAME and a 
- PARAMETER LIST (number of parameters, type of the parameters, and order of the parameters). 
The return type and exceptions are not considered as part of it. 
*/

// Java Program to Illustrate Methods

// Importing required classes
import java.io.*;

// Class 1
// Helper class
class CarMethod {

	// Initially taking sum as 0
	// as we have not started computation
	String engineBrand = " ";

	// Method: returns car engine brand
	public String getEngineBrand(String engineBrand)
	{
		//
        System.out.println(engineBrand);
		// 
		return engineBrand;
	}
}

// Class 2
// Helper class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1 inside main() method
		CarMethod addEngineBrand = new CarMethod();

		// Calling method of above class
		// to get value engineBrand parameter
		String s = addEngineBrand.getEngineBrand("PW");

		// Printing the engine brand
		System.out.println("The engine brand is : " + s);
	}
}

