package mca226;
import java.util.*;
import java.util.Scanner;
public class product {

int price,pcode;
String  pname;
public product(String a,int b,int c)
{
pname=a;
pcode=b;
price=c;
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);

System.out.println("enter the name of the product1:");
String a=s.nextLine();
System.out.println("enter the product1 code:");
int b=s.nextInt();
System.out.println("enter the PRICE of the product1:");
int c=s.nextInt();
product obj1=new product(a,b,c);
s.nextLine();


//second start
System.out.println("enter the name of the product2:");
String l=s.nextLine();
System.out.println("enter the product2 code:");
int m=s.nextInt();
System.out.println("enter the PRICE of the product2:");
int n=s.nextInt();
product obj2=new product(l,m,n);
s.nextLine();


//third start
System.out.println("enter the name of the product3:");
String o=s.nextLine();
System.out.println("enter the product3 code:");
int p=s.nextInt();
System.out.println("enter the PRICE of the product3:");
int q=s.nextInt();
product obj3=new product(o,p,q);
obj1.display();
obj2.display();
obj3.display();

if(obj1.price>obj2.price && obj1.price>obj3.price)
{
	System.out.println("First product is costly" +obj1.price);
}
if(obj2.price>obj3.price)
{
	System.out.println("second product is costly" +obj2.price);
}
else
{
	System.out.println("third product is costly" +obj3.price);
}
}

public void display()
{
System.out.println("Product name:" +pname);
System.out.println("Product code:" +pcode);
System.out.println("Product price:" +price);
}

}
