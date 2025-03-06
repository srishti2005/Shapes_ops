//Square.java

//Rectangle.java

import java.util.*;
class Square extends Shape{
	public Square(double edge){
		super(edge ,0,0,4); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return  dim_one * dim_one;	
	}
	public double  calculatePerimeter(){
		return 4 * (dim_one) ;
	}
}

