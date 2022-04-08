/*Class Declaration: in this code, I introduce basic class and class instantiation concepts of OOP*/  

public class Car
{
	// Instance Variables
	String brand;
	String model;
	int year;
	String color;

	// Constructor Declaration of Class
	public Car(String brand, String model,
				int year, String color)
	{
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	// method to get the brand value
	public String getBrand()
	{
		return brand;
	}

	// method to get the model value
	public String getModel()
	{
		return model;
	}

	// method to get the year value
	public int getYear()
	{
		return year;
	}

	// method to get the color value
	public String getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
		return("Car brand is "+ this.brand+
			".\nCar model,year and color are " +
			this.getModel()+"," + this.getYear()+
			","+ this.getColor());
	}


    //Driver method
	public static void main(String[] args)
	{
		Car navigator = new Car("Lincoln","Navigator", 2021, "navy");
		System.out.println(navigator.toString());
	}
}
