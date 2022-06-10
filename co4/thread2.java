package mca226;
import java.io.*;  

//Define 2 classes; one for generating Fibonacci numbers and other for displaying even
//numbers in a given range. Implement using threads. (Runnable Interface)
import java.util.Scanner;
public class thread2 {
	public static void main(String[]args) {
		//fib obj1=new fib();
		even obj2=new even();
		//obj1.start();
		obj2.start();
	}
}

/*class fib extends Thread{
	int n;
	Scanner sc=new Scanner(System.in);
	public
}
*/


class even extends Thread{
	int n;
	Scanner sc=new Scanner(System.in);
	public even() {
		System.out.println("enter the range");
		n=sc.nextInt();
		
	}
	public synchronized void run() {
		for(int i=1;i<n;i++) {
			if(i%2==0) {
				System.out.println(i+"is even number");
			}
		}
	}
}