package exam;
import java.util.*;
import java.util.ArrayList;

class Stack <T>{
	ArrayList<T> S;
	int top=-1,size;
	Stack(int s){
		this.size=s;
		this.S=new ArrayList<T>(size);
	}
	void push(T newData) {
		if(top+1 == size) {
			System.out.println("Stack overflow");
			}
		else {
			top++;
			if(S.size()>top) {
				S.set(top,newData);
				}
			else {
				S.add(newData);
			}
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}
		else {
			top--;
		}
	}
	void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(S.get(i));
		}
	}
	T top() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			return S.get(top);
		}
	}
}


public class soperations {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of stack");
		int x=sc.nextInt();
		Stack<Integer> obj=new Stack<>(x);
		
		System.out.println("enter the data to be inserted");//inserting data to the stack
		for(int i=0;i<x;i++){
			int n=sc.nextInt();
			obj.push(n);
		}
		
		System.out.println("After Push");
		obj.display();
		
		System.out.println("Top"); 
		System.out.println(obj.top());//top of the stack
		
		obj.pop();  //deleting data  from stack
		System.out.println("After Pop");
		obj.display();
		
		System.out.println("Top after pop");
		System.out.println(obj.top()); //top after deletion
	}
}
