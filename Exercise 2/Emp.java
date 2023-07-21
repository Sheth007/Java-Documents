class Emp
{
	int age;
	String name;
	float sal;
	void set_val()
	{
		age=28;
		name="Uday";
		sal=4000;
	}
	void disp_val()
	{
		System.out.println("Age is :"+age);
		System.out.println("Name is :"+name);
		System.out.println("Sal is :"+sal);
	}
	
	public static void main(String[] args)
	{
		Emp e1=new Emp();
		e1.set_val();
		e1.disp_val();
	}
}