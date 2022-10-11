package lab4;

public class Square implements Shape{
	
	private int length;
	
	public Square(int length) {
		this.length = length;
	}
	
	public double getArea() {
		return length*length;
	}
}
