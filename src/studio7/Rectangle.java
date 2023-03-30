package studio7;

public class Rectangle {
private double length;
private double width;
private double area;
private double perimeter;
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
		
	}
	public double area() {
		area = length * width;
		return area;
		
	}
	
	public double perimeter() {
	perimeter = 2 * length + 2 * width;
		return perimeter;
		
	}
	public boolean isSquare() {
		return length==width;
		
	}
}