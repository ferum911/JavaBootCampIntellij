package activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
	}

	public abstract double calculateArea(double length, double breadth);

	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double


	public abstract double calculatePerimeter(double length, double breadth);
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}

	

}
