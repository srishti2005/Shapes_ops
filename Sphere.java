.//Sphere.java
//Pyramid.java

import java.util.*;
class Sphere extends Shape{
	public Sphere(double Sradius ){
		super(Sradius,0,0,0); //super keyword refers to the shape constructor
		
	}
	
	public double calculateArea(){
		return  (4 * (dim_one * dim_one)  * (3.14));	
	}
	public double  calculateVolumw(){
		return 1.33 * (dim_one ) * (dim_one ) *(dim_one ) * (3.14);
	}
}

