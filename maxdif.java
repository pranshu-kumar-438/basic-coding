import java.io.*;
import java.util.Scanner;
import java.lang.*;


class maxdif
{
        static void maxdiff(int arr[],int n)
          {
             int res=arr[1]-arr[0] , minel=arr[0];              //initializing res and minel
             for(int j=1;j<n;j++)
              {
                res=Math.max(res,(arr[j]-minel));               //minel=minimum element
                minel=Math.min(minel,arr[j]);
              }
             System.out.println("\n the maximum difference of the elements in the array is:"+res);
          }
       public static void main(String args[])throws Exception
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
            maxdiff(arr,n);
        }
}
                  