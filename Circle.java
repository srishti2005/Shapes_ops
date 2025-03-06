//ciecle.java

//Rectangle.java

import java.util.*;
class Circle extends Shape{
	public Circle(double radius){
		super(radius ,0,0,0); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return   dim_one * dim_one * 3.14;	
	}
	public double  calculatePerimeter(){
		return 2 * (dim_one) * (3.14);
	}
}
