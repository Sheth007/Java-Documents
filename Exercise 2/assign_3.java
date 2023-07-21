class Student
{
	int age;
	String name,gender;
	Student()
	{
		age=0;name=" ";gender=" ";
	}
	Student(int i,String n)
	{
		age=i;
		name=n;
		gender=n;
	}
	Student(int i,String n,String m)
	{
		age=i;
		name=n;
		gender=m;
	}
void display()
{
	System.out.println(age+" "+name+" "+gender+" ");
}
}
class Assign_3
{
public static void main(String args[])
	{
	Student s1=new Student(50,"xyz","F");
	Student s2=new Student(60,"abc","M");
	Student s3=new Student(70,"xyz","F");
	s1.display();
	s2.display();
	s3.display();
	} 
}