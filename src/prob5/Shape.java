package prob5;

public abstract class Shape {

	int countSides;
	
	Shape(int countSides){
		this.countSides = countSides;
	}
	
	int getCountSides (){
		return countSides;
	}
	
	abstract double getArea();
	abstract double getPerimeter();
}
