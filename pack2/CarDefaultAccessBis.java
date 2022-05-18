// This Java program to illustrate ERROR while
// using class from different package with
// DEFAULT MODIFIER
package pack2;
import pack1.*;

// This class is having default access modifier
class CarDefaultAccessBis
{
	public static void main(String args[])
	{
		// Accessing class Geek from package pack1
		CarDefaultAccess obj = new CarDefaultAccess();
		obj.display(); //ERROR message: The type CarDefaultAccess is NOT VISIBLE
	}
}

