class test_trycatch
{
    public static void main(String[] args) {
        try{
            int a,b,c;
            a=5;
            b=0;
            c=a/b;
            system.out.println(c);
        }
        catch(ArithmeticExeption e)
        {
            system.out.println("Error Division by zeor"+e);
        }
        system.out.println("Rest of the code....");
    }
}