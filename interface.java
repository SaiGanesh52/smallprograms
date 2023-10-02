//interface-class=implements
//interface-interface=extends
//class-class=extends
interface Bike
{ 
    int x=100;       //do not change because variables are static and final
    public void M1();

class Car implements Bike   //interface used to implements keyword
{
    public void M1()
    {
        System.out.println("My faverate is car....");
    }
}
public static void main(String args[])
{
    Car c=new Car();
    c.M1();
    System.out.println(c.x);
    
} 
}