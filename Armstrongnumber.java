import java.util.*;
class Armstrongnumber
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
        r=num%10;                              //153=(1*1*1)+(5*5*5)+(3*3*3)       
        num=num/10;                            //      1       125      27 
        sum=sum+(r*r*r);


    }
    if(temp==sum)
    {
        System.out.println("its Armstrong  number");

    }
    else
    {
        System.out.println("its not  Armstrong number");
   
    }

    }
}