// Java program to illustrate
// protected modifier
package pack2;
import pack1.*; // importing all classes in package pack1

// Class CarProtectedAccessBis is subclass of CarProtectedAccess
class CarProtectedAccessBis extends CarProtectedAccess
{
    public static void main(String args[])
    {
        CarProtectedAccessBis obj = new CarProtectedAccessBis();
        obj.displayProtectedAccess(); // result: 'CarProtecytedAccess's
    }
	
}

