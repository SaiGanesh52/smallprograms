import java.util.*;
class Sai
{
    public static void main(String ards[])
    {
        StringBuffer s=new StringBuffer("Sai ganesh");
        StringBuilder s1=new StringBuilder("MY college");
        System.out.println("string is:"+s);
        s.delete(2,4);
        s.append("Lanka");
        s1.delete(2,4);
        s1.append("\nLanka");
        System.out.println("After :"+s);
        System.out.println("After :"+s1);
        
    }
}