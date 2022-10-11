package lab4;

public class Pyramid {
	private Triangle t = new Triangle();
	public Pyramid(int height, int base) {
		t.setHeight(height);
		t.setBase(base);
	}
	public double getSurfaceArea() {
		return 2 * t.getHeight() * t.getBase() + Math.pow(t.getBase(),2);
		//below is probably wrong, is volume ??
		//return 1/3 * t.getHeight() * Math.pow(t.getBase(),2);
	}
}
