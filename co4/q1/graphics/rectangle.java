package graphics;

public class rectangle implements shapes {
	int l;
	int b;
	public rectangle(int i,int j) {
		l=i;
		b=j;
	}
	public void area() {
		System.out.println(l*b);
	}
}
