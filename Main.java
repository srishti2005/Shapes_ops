//Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------Triangle-------------------------------");
		System.out.println("Enter the base of triangle: ");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the height of triangle: ");
		double height = Double.parseDouble(sc.nextLine());
		Shape Triangle = new Triangle(base , height);
		System.out.println("Area of Triangle is: "+Triangle.calculateArea());
		System.out.println("Perimeter of Triangle is: "+Triangle.calculatePerimeter());
		System.out.println("---------------------------Rectangle-----------------------------");
		//System.out.println("------------------------------------------------------");
		System.out.println("Enter the length of Rectangle: ");
		double length = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the breadth of Rectangle: ");
		double breadth = Double.parseDouble(sc.nextLine());
		Shape Rectangle = new Rectangle(length , breadth);
		System.out.println("Area of Rectangle is: "+Rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle is: "+Rectangle.calculatePerimeter());
		System.out.println("----------------------------Cube--------------------------");
		System.out.println("Enter the side of Cube: ");
		double side = Double.parseDouble(sc.nextLine());
		Shape Cube = new Cube(side);
		//System.out.println("------------------------------------------------------");
		System.out.println("Area of Cube is: "+Cube.calculateArea());
		System.out.println("Perimeter of Cube is: "+Cube.calculatePerimeter());
		System.out.println("---------------------------Pyramid----------------------------");
		System.out.println("Enter the base of pyramid: ");
		double pbase = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the slant height of pyramid: ");
		double slantHeight = Double.parseDouble(sc.nextLine());
		Shape Pyramid = new Pyramid(pbase , slantHeight);
		//System.out.println("------------------------------------------------------");
		System.out.println("Area of Pyramid is: "+Pyramid.calculateArea());
		System.out.println("Perimeter of base of the pyramid is: "+Pyramid.calculatePerimeter());
	}
	
}
