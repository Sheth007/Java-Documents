class test_day
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		switch(num)
		{
			case 1:
				System.out.println("Monday");
				break;
			
			case 2:
				System.out.println("Tuseday");
				break;
				
			case 3:
				System.out.println("wed.day");
				break;
				
			case 4:
				System.out.println("thusday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("saturday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("wrong");
		}
	}
}