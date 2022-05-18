package pack1;

// Java program to illustrate ERROR while using class from different package with
// PRIVATE MODIFIER: Methods & vbles accessibles only in SAME CLASS

class CarPrivateAccess
{
// private void display()
protected void display()
	{
		System.out.println("CarPrivateAccess");
	}
}

class CarPrivateAccessBis
{
public static void main(String args[])
	{
		CarPrivateAccess obj = new CarPrivateAccess();
		// Trying to access private method
		// of another class
		obj.display();
        // The method display() from the type CarPrivateAccess is not visible
	}
}

