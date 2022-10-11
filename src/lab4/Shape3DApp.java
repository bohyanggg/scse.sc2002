package lab4;

public class Shape3DApp {

	public static void main(String[] args) {
		Sphere s = new Sphere(10);
		Cone cone = new Cone(10,25);
		Cylinder c = new Cylinder(10,50);
		
		System.out.printf("Total area: %.2f\n",
				s.getSurfaceArea() + cone.getSurfaceArea() + c.getSurfaceArea());
	}

}
