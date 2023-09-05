class StringMethods
{
    public static void main(String args[])
    {
       String s1="  Im Indian  ";
        String s2=new String("SaiGanesh");
        String s3=new String("saiganesh");
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat("SaiGanesh"));//append
        System.out.println(s1.substring(5));
        System.out.println(s1.charAt(6));
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.isEmpty());
        System.out.println(s1.trim());
    }
}