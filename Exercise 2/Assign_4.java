class Triangle
{
	float base;
	double height;
	Triangle()
	{
		base=0.5f;
		height=5.0;
	}
	Triangle(float i,double n)
	{
		base=i;
		height=n;
	}
	void calArea()
	{
		System.out.println(0.5*base*height);
	}
}

class Assign_4
{
	public static void main(String args[])
	{
	Triangle t1=new Triangle();
	Triangle t2=new Triangle(19f,5);
	t1.calArea();
	t2.calArea();
	}
}