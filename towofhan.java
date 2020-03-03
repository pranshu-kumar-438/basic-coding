import java.lang.*;
import java.io.*;
import java.util.*;
class towofhan
{
   static void toh(int n,char A,char B,char C)
      {
         if(n==1)
            {
              System.out.println(" move 1 from "+A+" to "+C);
              return;
            }
         toh(n-1,A,C,B);
         System.out.println(" move "+n+" from "+A+" to "+C);
         toh(n-1,B,A,C);
         return;
      }
    public static void main(String args[])
       {
           int n=3;
           char A='A';
           char B='B';
           char C='C';
           toh(n,A,B,C);
       }
}