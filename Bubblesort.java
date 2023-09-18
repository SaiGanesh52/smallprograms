/*class Bubble
{
    public static void main(String args[])
    {
        int arr[]={3,5,1,2,45};  //array of eliments
        int length=arr.length;  //find length
       System.out.println("un sorted arrys is");
        for(int i=0;i<length;i++)
        System.out.println(arr[i]+" ");
        
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length-i;j++)
            {
                if(arr[j-1]>arr[j])       //swapping
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("sorted arrys is");
        for(int i=0;i<length;i++)
        System.out.println(arr[i]+" ");
    }
}*/
class Sravan
{
    public static void main(String args[])
    {
        int arr[]={33,6,88,166,2,4};
        int length=arr.length;
        System.out.println("unsorted list is:");
        for(int i=1;i<length;i++)
        System.out.println(arr[i]+" ");
         
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("sorted list is:");
        for(int i=1;i<length;i++)
        System.out.println(arr[i]+" ");
    }
}