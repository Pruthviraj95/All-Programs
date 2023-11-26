
class LowBalance extends Exception
{
	String msg;
	LowBalance(){
	msg="Low balance";
	}
}
class Mismatch extends Exception
{
	String msg;
	Mismatch(){
	msg="Password or Username mismatched";
	}
}
class NegativeNumber extends Exception
{
	String msg;
	NegativeNumber(){
		msg="Number entered is negative";
		}
}
class Bk{
	//here we do not assign values in methods as we will need this values in multiple methods
	//and to do so we will need to inherit it
	//to avoid we placed it in Bk class it self
	//but as in method we can pass numbers in method but we cannot pass and accept values in class
	// directly so we used constructor
	private String name;
	private String pwd;
	private double bal;
	private static int temp=100;
	private int ac_no;
	Bk(String n,String p,double b)
	{
		ac_no=++temp;
		name =n;
		pwd=p;
		setbal(b);
	}
		public void setbal(double b)
		{
			try{
				if(b<0)
				{
					throw new NegativeNumber();
				}
				else 
				{
					bal=b;
				}
			}
			catch(NegativeNumber e)
			{
				System.out.println(e);
			}
		}
		public boolean CheckCred(String n,String p)
		{
			try
			{
				if(n.equals(this.name) && p.equals(this.pwd))
				{
					return true;
				}
				else
				{
					throw new Mismatch();
				}
				
			}
			catch(Mismatch e)
			{
				System.out.println(e);
			}
			return false;
		}
		
		public double BalEnq(String n,String p)
		{
			if(CheckCred(n,p))
			{
				return this.bal;
			}
			else
			return 0;
		}
		public String Withdraw(String n,String p,double x)
		{
			try
			{
				if(x<0)
				{
					throw new NegativeNumber();
				}
				else
				{
					if (CheckCred(n,p))
					{
						try
						{
							if((bal-x)<500)
							{
								throw new LowBalance();
							}
							else
							{
								bal=bal-x;
								return "success withdrawl";
							}
						}
						catch(LowBalance e)
						{
							System.out.println(e);
						}
					}
					else
					{
						return "Mismatch";
					}
				}
			}
			catch(NegativeNumber e)
			{
				System.out.println(e);
			}
			return "negative no";	
							
		}
		public String Deposit(String n,String p,double x)
		{
			try
			{
				if(x<0)
				{
					throw new NegativeNumber();
				}
				else
				{
					if (CheckCred(n,p))
					{
						bal=bal+x;
						return "success";
					}
					else
					{
						return "Mismatch";
					}
				}
			}
			catch(NegativeNumber e)
			{
				System.out.println(e);
			}
			return "negative no";	
		}
		public String Transfer(String n,String p,double x)
		{
			try
			{
				if(x<0)
				{
					throw new NegativeNumber();
				}
				else
				{
					if (CheckCred(n,p))
					{
						try
						{
							if((bal-x)<500)
							{
								throw new LowBalance();
							}
							else
							{
								bal=bal-x;
								return "success withdrawl";
							}
						}
						catch(LowBalance e)
						{
							System.out.println(e);
						}
					}
					else
					{
						return "Mismatch";
					}
				}
			}
			catch(NegativeNumber e)
			{
				System.out.println(e);
			}
			return "negative no";	
		}
}
class TestBank
{
	public static void main(String args[])
	{
	Bk b=new Bk("pratik","pk",1000);
	Bk b1=new Bk("vishal","vsh",20000);
	
	System.out.println(b.Withdraw("pratik","pk",10));
	System.out.println(b.BalEnq("pratik","pk"));
	System.out.println(b.Deposit("pratik","pk",10000));
	System.out.println(b.BalEnq("pratik","pk"));
	System.out.println(b.Transfer("pratik","pk",100));
	System.out.println(b.BalEnq("pratik","pk"));
	
	
	System.out.println(b1.Withdraw("vishal","vsh",50));
	System.out.println(b1.BalEnq("vishal","vsh"));
	System.out.println(b1.Deposit("vishal","vsh",1000));
	System.out.println(b1.BalEnq("vishal","vsh"));
	System.out.println(b1.Transfer("vishal","vsh",200));
	System.out.println(b1.BalEnq("vishal","vsh"));
	}
}