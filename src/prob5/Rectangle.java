package prob5;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	

	Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return width *2 + height *2;
	}

	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		width = width * rate;
		height = height * rate;
	}

}
