package lab4;

public class Triangle implements Shape{
	
	private int base;
	private int height;
	public Triangle(int height, int base) {
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		this(0,0);
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	public double getArea() {
		return 0.5 * base * height;
	}
	public double getHypotenuse() {
		return Math.sqrt(Math.pow(base,2) + Math.pow(height, 2));
	}
}
