class rect
{
	double length;
	double width;
	void set_val()
	{
		length=10;
		width=20;
	}
	void area()
	{
		System.out.println("Area is "+(length*width));
	}
	
	public static void main(String[] args)
	{
		rect r1=new rect();
		r1.set_val();
		r1.area();
	}
}