import java.util.*;
import java.io.*;
class File8
{
	public static void main(String args[]) throws Exception
	{
		File f=new File(args[0]);
		if(f.exists())
		{
			System.out.println("file exists");
			FileInputStream fis=new FileInputStream(args[0]);
			FileOutputStream fos =new FileOutputStream(args[0],true);
			BufferedOutputStream bos=
			DataInputStream dis = new DataInputStream(System.in);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("contents");
			int x;
			while((x=fis.read())!=-1)
			{
				System.out.print((char)x);
			}
			int str;
			do{
				System.out.println("DO you want to add or exit");
				System.out.println("1)yes\n2)no\n3)exit\n");
				str=sc.nextInt();
				switch(str)
				{
					case 1: char y;
						while((y=(char)dis.read())!='*')
						{
							fos.write(y);
						}
					break;
					case 2: int x1;
						while((x1=fis.read())!=-1)
						{
							System.out.print((char)x1);
						}
					case 3:
						break;
				}
			}while(str!=3);
			
		}
		else{ 
			System.out.println("file NOT exists");
			FileOutputStream fos =new FileOutputStream(args[0],true);
			FileInputStream fis=new FileInputStream(args[0]);
			DataInputStream dis = new DataInputStream(System.in);
			Scanner s=new Scanner(System.in);
			
			
			System.out.println("contents");
			int x;
			while((x=fis.read())!=-1)
			{
				System.out.print((char)x);
			}
			int str;
			do{
				System.out.println("DO you want to add or exit");
				System.out.println("1)yes\n2)no\n3)exit\n");
				str=s.nextInt();
				switch(str)
				{
					case 1: char y;
						while((y=(char)dis.read())!='*')
						{
							fos.write(y);
						}
					break;
					case 2: int x1;
						while((x1=fis.read())!=-1)
						{
							System.out.print((char)x1);
						}
					case 3:
						break;
				}
			}while(str!=3);
		}
	}
}