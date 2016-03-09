package prob5;

public class ShapeTest {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[2];
		
		shapes[0] = new Rectangle(5.0, 6.0);
		shapes[1] = new RectTriangle(6, 2);
		
		for(Shape s : shapes){
			System.out.println("area : " + s.getArea());
			System.out.println("perimeter : " + s.getPerimeter());
			if(s instanceof Resizable){
				((Resizable) s).resize(0.5);
				System.out.println("new area : " + s.getArea());
				System.out.println("new perimeter : " + s.getPerimeter());
			}
		}
	}
}
