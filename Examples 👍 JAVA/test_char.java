class test_char
{
	public static void main(String[] args)
	{
		char ch=args[0].charAt(0);
		switch(ch)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("vowel");
				break;
			
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'J': 
			case 'K': 
			case 'L':
			case 'M': 
			case 'N': 
			case 'P':  
			case 'Q': 
			case 'R': 
			case 'S': 
			case 'T': 
			case 'V': 
			case 'W': 
			case 'X': 
			case 'Y':
			case 'Z':
				System.out.println("con.");
				break;
				
			default:
				System.out.println("invaid");
		}
	}
}