package assignment5_part1;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(15);
		System.out.println("Circle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		@SuppressWarnings("unused")
		Rectangle r = new Rectangle(12,44);
		System.out.println("\n\nRectangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		@SuppressWarnings("unused")
		Triangle t = new Triangle(20,30,15,30,24);
		System.out.println("\n\nTriangle");
		System.out.printf("Area: %.2f",c.Area());
		System.out.printf("\nPerimeter: %.2f",c.Perimeter());
		
		
	}

}