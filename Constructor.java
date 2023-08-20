class Constructor
{
    int id;
    String name;
    Constructor(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+""+name);
    }
    public static void main(String args[])
    {
        Constructor sc=new Constructor(123,"\tSAI");
        Constructor cs=new Constructor(456,"\tganesh");
        sc.display();
        cs.display();
    }
}