package mca226;
import java.util.Scanner;
public class ArraySearch {
	public void search(int element,int size,int array[])
	{
		for(int i=0;i<size;i++)
		{
			if( array[i] == element )
			{
				i++;
				System.out.println("elemt found at position:" + i);
				break;
			}
		}
	}
	
	public static void main ( String [] args) {
		Scanner s=new Scanner(System.in);
		ArraySearch obj=new ArraySearch();
		int array[]=new int[10];
		System.out.println("Enter the array size:");
	    	int size = s.nextInt();
		for(int i=0;i<size;i++) {
			
			System.out.println("enter array element");
			array[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println("element at index" + i + ":" +array[i]);
		}
		System.out.println("enter the element to be searched");
		int element=s.nextInt();
		obj.search(element,size,array);
		
		
		

	}
}
