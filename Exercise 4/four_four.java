class compute extends Exception
{
    compute(String s)
    {
        super(s);
    }
}
public class four_four
{
    static void check(int a)
    throws compute
    {
        if(a>10)
            throw new compute("Integer parameter is not valid");
        else
            System.out.println("Integer parameter is valid");
    }
    public static void main(String[] args) 
    {
        try
        {
            check(13);
        }    
        catch(compute e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("::: Finally Block Executed :::");
        }
    }
}