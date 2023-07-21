//multiple catch in java

class test_trycatch2
{
    public static void main(String[] args) {
        try{
            int a,b,c;
            a=5;
            b=2;
            c=a/b;
            arr[5]=10;
            system.out.println("c");
        }
        catch(ArithmeticExeption e){
            system.out.println("division by zero"+e)      ;
        }
        catch(ArrayOutOfBoundException ae){
            system.out.println("Array index out of bound exception"+ae);
        }
        catch(exception ex){
            system.out.println(ex);
        }
    }
}