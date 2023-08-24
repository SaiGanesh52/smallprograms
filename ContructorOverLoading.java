class Cone
{
    int id;
    String name;
    int age;
    Cone(int i,String n)
    {
       id=i;
       name=n;

    }
    Cone(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;

    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String ars[])
    {
    Cone a1=new Cone(11,"sai");
    Cone a2=new Cone(112,"ganesh",20);
     a1.display();
     a2.display();
   }
}