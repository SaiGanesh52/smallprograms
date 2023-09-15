import java.util.*;
class Plindromenumber
{
    static int r,sum=0,temp;
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int num=sc.nextInt();

    temp=num;

    while(num>0)                               //dont know exact number of itarations so use "while loop" 
    {
        r=num%10;                              //55%10=5                5%10=5              
        sum=(sum*10)+r;                        //(0*10)+5=5             (5*10)+5=55
        num=num/10;                            //55%10=5                 

    }
    if(temp==sum)
    {
        System.out.println("its palindrom number");

    }
    else
    {
        System.out.println("its not  palindrom number");
   
    }

    }
}