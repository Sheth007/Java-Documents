import java.util.*;
class Person
{
	String firstname,lastname;
	Person()
	{
		firstname=" ";
		lastname=" ";
	}
	Person(String fname,String lname)
	{
		firstname=fname;
		lastname=lname;
	}
	void display()
	{
		System.out.println("Name is :"+firstname+" "+lastname);
	}
}
class Student extends Person
{
	int rollno,enroll;
	Student()
	{
		rollno=0;
		enroll=0;
	}
	Student(String fname,String lname,int rno,int eno)
	{
		super(fname,lname);
		rollno=rno;
		enroll=eno;
	}
	void display()
	{
		super.display();
		System.out.println("Roll no & Enroll no is :"+rollno+" "+enroll);
	}
}
class Result extends Student
{
	int marks1,marks2;
	Result()
	{
		marks1=0;
		marks2=0;
	}
	Result(String fname,String lname,int rno,int eno,int m1,int m2)
	{
		super(fname,lname,rno,eno);
		marks1=m1;
		marks2=m2;
	}
	void display()
	{
		super.display();
		System.out.println("Marks is :"+(marks1+marks2));
	}
}
class Demo_EX
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, Rollno, Enrollno, & Marks");
		String fname=sc.next();
		String lname=sc.next();
		int rno=sc.nextInt();
		int eno=sc.nextInt();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		Result s = new Result(fname,lname,rno,eno,m1,m2);
		s.display();
	}
}