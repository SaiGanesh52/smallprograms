import java.util.*;
class Factorial
{
    static int factorial(int num)
    {
        if (num==0)
        {
            return 1;
        }
        else
        {
            return(num*factorial(num-1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your wish number:");
         int a=sc.nextInt();

        int fact=1;
        fact=factorial(a);

        System.out.println("factorial number is:"+a+"after is:"+fact);
        sc.close();
    }
}