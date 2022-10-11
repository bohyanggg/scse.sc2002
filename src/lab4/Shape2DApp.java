package lab4;

public class Shape2DApp {

	public static void main(String[] args) {
		Shape[] shapeArr = new Shape[3];
		shapeArr[0] = new Circle(10);
		shapeArr[1] = new Triangle(25,20);
		shapeArr[2] = new Rectangle(50,20);
		
		double totalArea = 0.0;
		for(Shape s: shapeArr) {
			totalArea += s.getArea();
		}
		System.out.printf("Total area: %.2f\n", totalArea);
	}

}
