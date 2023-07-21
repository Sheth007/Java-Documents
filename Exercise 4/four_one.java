/**
 * four_one
 */
public class four_one 
{
    public static void main(String[] args) 
    {
        try
        {
            int arr[] = {1,2};
            for(int i=0;i<=arr.length;i++)
            {
                System.out.println(arr[3]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e+"\n");
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae+"\n");
        }
        
    System.out.println("REST OF THE CODE...");
    }
}