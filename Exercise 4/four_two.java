class four_two
{
    public static void main(String args[]) 
    {
        try
        {
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            int z=Integer.parseInt(args[2]);
            int sum=(x+y+z)/3;
            System.out.println("The sum is :" +sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println("The number format exception :: "+e);
        }
    }
}