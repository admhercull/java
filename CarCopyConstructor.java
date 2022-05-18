public class CarCopyConstructor {

    private String brand;
    private int year;

    // A normal parameterized constructor
    public CarCopyConstructor(String brand, int year) {
           this.brand = brand;
           this.year = year;
    }

    // copy constructor
    CarCopyConstructor(CarCopyConstructor carcp) {
        System.out.println("Car copy constructor called");
        brand = carcp.brand;
        year = carcp.year;
    }

    // Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + brand + " " + "year " +year + ")";
    }
    
    public static void main(String[] args) {
        CarCopyConstructor c1 = new CarCopyConstructor("Toyota", 1997);
         
        // Following involves a copy constructor call
        CarCopyConstructor c2 = new CarCopyConstructor(c1);
 
        // Note that following doesn't involve a copy constructor call as
        // non-primitive variables are just references.
        CarCopyConstructor c3 = c2;
 
        System.out.println(c2); // toString() of c2 is called here
    }


}
