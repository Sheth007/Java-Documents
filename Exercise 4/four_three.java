/**
 * four_three
 */
class compute extends Exception 
{
    compute(String s)
    {
        super(s);
    }
}
public class four_three 
{
    static void check(int a)    
    throws compute
    {
        if(a>10)
            throw new compute("Integer parameter is invalid");
        else
            System.out.println("integer parameter is valid");
    }
    public static void main(String[] args) 
    {
        try
        {
            check(13);
        }   
        catch(compute e) 
        {
            System.out.println("Exception :: "+e);
        }
        System.out.println("Program worked successfully........");
    }
}