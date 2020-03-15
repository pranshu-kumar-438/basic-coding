import java.util.Scanner;
import java.io.*;

class arrdup
{
    static void remdup()
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
          int res=1;
          for(int i=1;i<n;i++)
          {
             if(arr[i]!=arr[res-1])
                 {
                     arr[res]=arr[i];
                     res++;
                 }
                       
          }
         
          System.out.println("\n the array after removal of duplicate items is:");
          for(int i=0;i<res;i++)
          {
              System.out.print(" "+arr[i]);
          }
      }
    public static void main(String args[])throws Exception
     {
        remdup();
     }
}