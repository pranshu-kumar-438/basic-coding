import java.util.Scanner;
import java.io.*;

class arr1
{
    public static void printarr()
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
         System.out.println("entered array before reversing is given as: ");
         for(int i=0;i<n;i++)
           {
               System.out.print(" "+arr[i]);
           }
         int a=0;
         int b=n-1;
         while(a<b)
           {
               int temp=arr[a];
                 arr[a]=arr[b];
                 arr[b]=temp;
              a++;
              b--;
           }
         System.out.println("\n entered array after reversing is given as:");
         for(int i=0;i<n;i++)
          {
             System.out.print(" "+arr[i]);
          }
      }
    public static void main(String args[])throws Exception
     {
         printarr();
     }
}
 
         