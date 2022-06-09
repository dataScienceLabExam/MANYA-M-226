import graphics.*;
public class findarea {
	public static void main(String[]args) {
		circle c1=new circle(2);
		System.out.println("Area of the circle is");
		c1.area();
		
		rectangle r1=new rectangle(2,4);
		System.out.println("area of rectangle");
		r1.area();
		
		triangle t1=new triangle(4,6);
		System.out.println("area of triangle");
		t1.area();
		
		square s1=new square(4);
		System.out.println("area of square");
		r1.area();
	}
}
