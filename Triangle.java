//Triangle.java
import java.util.*;
class Triangle extends Shape{
	public Triangle(double base , double height){
		super(base,height,0,3); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return 0.5 * dim_one * dim_two;	
	}
	public double  calculatePerimeter(){
		return (dim_one + dim_two) + Math.sqrt((dim_one * dim_one) +( dim_two * dim_two));
	}
}
