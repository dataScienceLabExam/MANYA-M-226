package graphics;

public class circle implements shapes {
	int radius;
	public circle(int i)
	{
		radius=i;
	}
	public void area() {
		System.out.println(3.14*radius*radius);
	}

}
