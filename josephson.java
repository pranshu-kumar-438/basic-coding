import java.util.*;
import java.lang.*;
import java.io.*;
class josephson{
     static int joseph(int n,int k)
          {
             if(n==1)
                return 0;
             else
                return (joseph(n-1,k)+k)%n;
          }
    public static void main(String args[])
         {
               System.out.println("\n the survivor of the ring is person number "+joseph(7,3));
         }
}
