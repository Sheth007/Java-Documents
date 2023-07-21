class Calculate
{
	int add(int a, int b)
	{
		return(a+b);
	}
	float add(float a, float b)
	{
		return(a+b);
	}
	String add(String a, String b)
	{
		return(a+b);
	}
}

class Assign_5
{
	public static void main(String args[])
	{
		Calculate c1=new Calculate();
		int a=c1.add(10,20);
		float b=c1.add(10.0f,20.0f);
		String c=c1.add("Hi","How are you?");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}