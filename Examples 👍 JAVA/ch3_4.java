class testthrow
{
    static void validate(int age) 
    {
        if(age<18){
            throw new ArithmeticExeption("not valid");
        else
            system.out.println("valid for vote");
    }
    public static void main(String[] args) {
        validate(12);
        system.out.println("rest of the code.......")
    }
    }
}