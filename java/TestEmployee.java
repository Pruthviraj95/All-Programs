import java.lang.*;
class Employee{
	private String fname;
	private String lname;
	private double msal;
	Employee(String fn,String ln,double ms){
		fname=fn;
		lname=ln;
		msal=ms;
	}
	public void setfname(String f){
		fname=f;
	}
	String getfname(){
		return fname;
	}
	public void setlname(String l){
		lname=l;
	}
	String getlname(){
		return lname;
	}
	public void setmsal(double ms){
		msal=ms;
	}
	double getmsal(){
		return msal;
	}
	void display(){
		System.out.println("first name"+fname);
		System.out.println("last name"+lname);
		System.out.println("mothly sal"+msal);
		
	}
	double ysal(double b){
		return b*12;
	}
}
class TestEmployee{
public static void main(String args[]){
Employee e1=new Employee("","",0);
e1.setfname("Harsh");
e1.setlname("Dinde");
e1.setmsal(10000);
System.out.println("First name : "+e1.getfname()+" Last Name : "+e1.getlname()+" montly sal : "+e1.getmsal()+" yearly sal : "+e1.ysal(e1.getmsal()));

Employee e2 = new Employee("Pruthvi","Talap",20000);
e2.display();
System.out.println("yearly sal : "+e2.ysal(e2.getmsal()));
}
}