class test_month
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		switch(num)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("days:31");
				break;
			
			case 2:
				System.out.println("Febuary");
				System.out.println("Days : 28/29");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Days : 30");
				break;
				
			default:
				System.out.println("wrong");
		}
	}
}