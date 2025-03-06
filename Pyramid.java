//Pyramid.java

import java.util.*;
class Pyramid extends Shape{
	public Pyramid(double pbase , double slantHeight ){
		super(pbase,slantHeight,0,12); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return  (0.75 * (dim_one * dim_one) + 1.5 * (dim_one * dim_two));	
	}
	public double  calculatePerimeter(){
		return 4 * (dim_one ) ;
	}
}

