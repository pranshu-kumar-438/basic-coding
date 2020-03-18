import java.io.*;
import java.lang.*;
import java.util.Scanner;
 
class trap
{
      static void TRAP(int arr[],int n)
       {
         int res=0;
         int lmax[]=new int[n],rmax[]=new int[n]; 
         lmax[0]=arr[0];
         for(int i=1;i<n;i++)
         {
           lmax[i]=Math.max(arr[i],lmax[i-1]);            //maximum wall size to the left of the element
         } 
         rmax[n-1]=arr[n-1];
         for(int i=n-1;i>=0;i--)
         {
           rmax=Math.max(arr[i],rmax[i+1]);               //maximum wall size to the right of the element
         }
        for(int i=0;i<n;i++)
        {
          res+=Math.min(lmax[i],rmax[i])-arr[i];     //calculating the total trapped water
        }
        System.out.println(" total trapped water="+res);
       }
    

      public static void main(String args[])
       {
         int arr[]=new int[100];
          Scanner sc=new Scanner(System.in);
            System.out.println("\n enter the size of the array:");
            int n=sc.nextInt();
            System.out.println("\n enter the elements of the array:");
            for(int i=0;i<n;i++)
              { 
                 arr[i]=sc.nextInt();
              }
           TRAP(arr,n);
        }
}
                  