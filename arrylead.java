import java.io.*;
import java.util.Scanner;

class arrylead
{
 
   static void leader(int arr[],int n)                                                    
    {  
       int curr=arr[n-1];
       System.out.println(" "+curr);                                                                           
       for(int i=n-2;i>=0;i--)
           
                {
                  if(curr<arr[i])
                  
                  {
                   curr=arr[i];
                   System.out.print(" "+curr);
                  }
                }

           
     }
     public static void main(String args[])throws Exception
      {
         int arr[]=new int[100];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of the array :");
         int n=sc.nextInt();
         System.out.println("\n enter the elements of the array:");
         for(int i=0;i<n;i++)
         {
           arr[i]=sc.nextInt();
         }
         leader(arr,n);
      }
}
         