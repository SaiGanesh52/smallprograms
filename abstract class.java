abstract class First
{
    public abstract void argons();
     
    public void eye()
    {
        System.out.println("my eyes are donated.....");

    }
}
class Second extends First
{
    public void argons()
    {
        System.out.println("my heart was donated.....");
    }
}
class Test
{
    public static void main(String args[])
    {
       First e=new Second();
       e.argons();
       e.eye();

    }
}
