/*
    PROTECTED: The protected access modifier is specified using the keyword protected.
        The methods or data members declared as PROTECTED are accessible within 
        - the SAME PACKAGE or 
        - SAME SUBCLASSES in DIFFERENT PACKAGES.

    In this example, we will create two packages pack1 and pack2. 
    - Class CarProtectedAccess in pack1 is made PUBLIC, to access it in pack2. 
    The method displayProtectedAccess() in class CarProtectedAccess is PROTECTED and 
    - class CarProtectedAccessBis is inherited from class CarProtectedAccess and 
    this protected displayProtectedAccess() method is then accessed by creating an object 
    of class CarProtectedAccessBis.
*/

package pack1;

public class CarProtectedAccess {
    protected void displayProtectedAccess()
    {
        System.out.println("CarProtectedAccess");
    }
}
