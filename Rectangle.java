//Rectangle.java

import java.util.*;
class Rectangle extends Shape{
	public Rectangle(double length , double breadth){
		super(length,breadth,0,4); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return  dim_one * dim_two;	
	}
	public double  calculatePerimeter(){
		return 2 * (dim_one + dim_two) ;
	}
}

