
import java.util.*;
class account 
{
	 public static void main(String args[])
	 {
	int m,b;
	int balance=0;
Scanner sc=new Scanner(System.in);

System.out.println("enter amount to deposit:");
m=sc.nextInt();
balance=balance+m;
System.out.println("Balance amount:"+balance);
System.out.println("Enter amount to withdraw:");
b=sc.nextInt();
try
{
	if(b<balance)
	{
		System.out.println("suucessfull");
	}
	else
	{
		throw new userdefinedexception("error");
	}
}
	catch(userdefinedexception ae)
{
		System.out.println("no sufficient balance found");
}
}	
}


