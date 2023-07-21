//assignmrnt 1.4

class mark
{
	public static void main(String[] args)
	{
		int Roll_no = 23;
		String[] name = {"Meet Shingala"};
		int sub1 = 90;
		int sub2 = 85;
		int sub3 = 80;
		int sub4 = 75;
		int sub5 = 55;
		int total = sub1+sub2+sub3+sub4+sub5;
		int per = total/5;
		System.out.println("Roll_no is :"+Roll_no);
		System.out.println("Name is :"+name[0]);
		System.out.println("Total is :"+total);
		System.out.println("Percentage is :"+per);
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("First class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}