import java.io.*;
import java.util.Scanner;

class arrrotleft
{
      static void arrrot()
        {
           int arr[]=new int[100];
          Scanner sc=new Scanner(System.in);
          System.out.println("\n enter the size of the array:");
          int n=sc.nextInt();
          System.out.println("\n enter the items in the array:");
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          int temp=arr[0];
          for(int i=1;i<n;i++)
            {
              arr[i-1]=arr[i];
            }
           arr[n-1]=temp;
          System.out.println("\n array after rotating by one on left:");
          for(int i=0;i<n;i++)
            {
               System.out.print(" "+arr[i]);
            }
       }
    public static void main(String args[])throws Exception
    {
        arrrot();
    }
}   
            