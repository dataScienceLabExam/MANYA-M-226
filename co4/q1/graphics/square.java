package graphics;

public class square implements shapes {
	int a;
	public square(int i)
	{
		a=i;
	}
	public void area() {
		System.out.println(a*a);
	}

}
