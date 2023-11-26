import java.io.*;
import java.util.*;
interface Queue
{
	int size=5;
	void push(String s);
	void pop();
	void display();
	boolean overflow();
	boolean underflow();
	void choice();
	
}
class IntQueue implements Queue
{
	int top=-1;
	int bottom=0;
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
			System.out.println("\n");
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow");
			top=-1;
			bottom=0;
		}
		else
		{
			bottom=bottom+1;
			System.out.println("\n");
		}
	}
	public void display()
	{
		if(top<0||bottom>top)
		{
			System.out.println("Empty");
		}
		else{
			System.out.println("Data in Queue\n");
			for(int i=bottom;i<=top;i++)
			{
			System.out.println(""+iStack[i]);
			}
		}
	}	
	public boolean underflow()
	{
		if(top==-1||bottom>top)
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
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit\n");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("\n");
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
class StringQueue implements Queue
{
	int top=-1;
	int bottom=0;

	String iStack[]=new String[size];
	
	public void push(String s)
	{
		if(overflow())
		{
			System.out.println("overflow\n");
		}
		else
		{
			String sc=s;
			top=top+1;
			
			iStack[top]=sc;
			System.out.println("\n");
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow\n");
			top=-1;
			bottom=0;
		}
		else
		{
			bottom=bottom+1;
			System.out.println("\n");
		}
	}
	public void display()
	{
		if(top<0||bottom>top)
		{
			System.out.println("Empty\n");
		}
		else{
			System.out.println("Data in Queue\n");
			for(int i=bottom;i<=top;i++)
		{
			System.out.println(""+iStack[i]);
		}
		}
	}
	public boolean underflow()
	{
		if(top==-1||bottom>top)
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
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit\n");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("\n");
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
class DoubleQueue implements Queue
{
	int top=-1;
	int bottom=0;

	double iStack[]=new double[size];
	
	public void push(String s)
	{
		if(overflow())
		{
			System.out.println("overflow\n");
		}
		else
		{
			double sc=Double.parseDouble(s);
			
			top=top+1;
			
			iStack[top]=sc;
			System.out.println("\n");
			
		}
	}
	public void pop()
	{
		if(underflow())
		{
			System.out.println("underflow\n");
			top=-1;
			bottom=0;
		}
		else
		{
			bottom=bottom+1;
			System.out.println("\n");
		}
	}
	public void display()
	{
		if(top<0||bottom>top)
		{
			System.out.println("Empty\n");
		}
		else{
			System.out.println("Data in Queue\n");
			for(int i=bottom;i<=top;i++)
		{
			System.out.println(""+iStack[i]);
		}
		}
	}
	public boolean underflow()
	{
		if(top==-1||bottom>top)
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
		System.out.println("1.Push\n2.Pop\n3.Display\n4.exit\n");
		int b=pc.nextInt();
		switch(b)
			{
				case 1: 
					System.out.println("\n");
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
					System.out.println("\nEnter correct choice");
								
			}
		}while(flag==1);
	}
}
class TestQueue
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int flag=1;
		do{
		System.out.println("Enter the number");
		System.out.println("1.Interger Queue\n2.String Queue\n3.Double Queue\n4.exit");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: IntQueue n=new IntQueue();
					n.choice();
					break;
			case 2: StringQueue s=new StringQueue();
					s.choice();
					break;
			case 3: DoubleQueue d=new DoubleQueue();
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