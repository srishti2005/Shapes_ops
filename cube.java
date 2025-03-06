//Cube.java

import java.util.*;
class Cube extends Shape{
	public Cube(double side ){
		super(side,0,0,12); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return  6 * (dim_one * dim_one);	
	}
	public double  calculatePerimeter(){
		return 12 * (dim_one ) ;
	}
}
