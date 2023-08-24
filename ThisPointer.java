class Tpointer
{
    int id;
    String name;
    Tpointer(int id,String name)
    {
    this.id=id;
    this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        Tpointer s1=new Tpointer(23,"SAI");
        s1.display();
        Tpointer s2=new Tpointer(22,"SAIeee");
        s2.display();
    }
}