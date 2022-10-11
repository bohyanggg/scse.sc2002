package lab4;

public class Cuboid {
	private Rectangle r = new Rectangle();
	private int depth;
	public Cuboid(int length, int breadth, int depth) {
		r.setBreadth(breadth);
		r.setLength(length);
		this.depth = depth;
	}
	public double getSurfaceArea() {
		return 4 * r.getArea() + 2 * r.getBreadth() * depth;
		//below is to get volume not surface area
		//return r.getArea() * depth;
	}
}
