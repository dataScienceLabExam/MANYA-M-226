package arithmetic;

public interface operations{
		void addition();
		void subtraction();
		void multiplication();
		void division();
	}
	
public class arith implements operations {


		public void addition(int a,int b) {
			System.out.println("Addition of"+a+"and"+b+"is:"+(a+b));
			
		}


		public void subtraction(int a,int b) {
			System.out.println("Subtraction of"+a+"and"+b+"is:"+(a-b));
			
		}


		public void multiplication(int a,int b) {
			System.out.println("product  of"+a+"and"+b+"is:"+(a*b));
			
		}

		public void division(int a,int b) {
			System.out.println("Division of"+a+"and"+b+"is:"+(a/b));
			
		}

	}


