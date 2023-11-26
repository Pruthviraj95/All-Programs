import java.io.*;
import java.util.*;
interface Stack
{
	int size=5;
	void push(String s);
	void pop();
	void display();
	boolean overflow();
	boolean underflow();
	void choice();
	
}
class IntStack implements Stack
{
	int top=-1;
	int iStack[]=new int[size];

	public void push(String s)
	{
		if(overflow())
		{
			System.out.println("overflow");
		}
		else
		{	
			int sc=Integer.parseInt(s);
			
			top=top+1;
			
			iStack[top]=sc;
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow");
		}
		else
		{
			top=top-1;
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Empty");
		}
		else{
			for(int i=top;i>=0;i--)
		{
			System.out.println("stack "+iStack[i]);
		}
		}
	}
	public boolean underflow()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean overflow()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void choice()
	{
		Scanner pc=new Scanner(System.in);
		int flag=1;
		do{
		System.out.println("Enter the number");
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("Enter no");
					String s=pc.next();
					push(s);
					break;
				case 2: pop();
					break;
				case 3: display();
					break;
				case 4: flag=0;
					break;
				default: 
					System.out.println("Enter correct choice");
								
			}
		}while(flag==1);
	}
}
class StringStack implements Stack
{
	int top=-1;
	String iStack[]=new String[size];
	
	public void push(String s)
	{
		if(overflow())
		{
			System.out.println("overflow");
		}
		else
		{
			String sc=s;
			top=top+1;
			
			iStack[top]=sc;
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow");
		}
		else
		{
			top=top-1;
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Empty");
		}
		else{
			for(int i=top;i>=0;i--)
		{
			System.out.println("stack "+iStack[i]);
		}
		}
	}
	public boolean underflow()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean overflow()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void choice()
	{
		Scanner pc=new Scanner(System.in);
		int flag=1;
		do{
		System.out.println("Enter the number");
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("Enter str");

					String s=pc.next();
					push(s);
					break;
				case 2: pop();
					break;
				case 3: display();
					break;
				case 4: flag=0;
					break;
				default: 
					System.out.println("Enter correct choice");
								
			}
		}while(flag==1);
	}
}
class DoubleStack implements Stack
{
	int top=-1;
	double iStack[]=new double[size];
	
	public void push(String s)
	{
		if(overflow())
		{
			System.out.println("overflow");
		}
		else
		{
			double sc=Double.parseDouble(s);
			
			top=top+1;
			
			iStack[top]=sc;
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow");
		}
		else
		{
			top=top-1;
		}
	}
	public void display()
	{
		if(top<0)
		{
			System.out.println("Empty");
		}
		else{
			for(int i=top;i>=0;i--)
		{
			System.out.println("stack "+iStack[i]);
		}
		}
	}
	public boolean underflow()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean overflow()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void choice()
	{
		Scanner pc=new Scanner(System.in);
		int flag=1;
		do{
		System.out.println("Enter the number");
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("Enter no");

					String s=pc.next();
					push(s);
					break;
				case 2: pop();
					break;
				case 3: display();
					break;
				case 4: flag=0;
					break;
				default: 
					System.out.println("Enter correct choice");
								
			}
		}while(flag==1);
	}
}
class TestStack
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
		do{
		System.out.println("Enter the number");
		System.out.println("1.Interger stack\n2.String stack\n3.Double stack\n4.exit");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: IntStack n=new IntStack();
					n.choice();
					break;
			case 2: StringStack s=new StringStack();
					s.choice();
					break;
			case 3: DoubleStack d=new DoubleStack();
					d.choice();
					break;
			case 4: flag=0;
					break;
			default: 
					System.out.println("Enter correct choice");
		}
		}while(flag==1);
		
		
	}
	
}