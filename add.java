import java.io.*;
class add
{
  int sum=0;
   void sum(int x)
{
    sum=x*(x+1)/2;
    System.out.println("the sum of first " +x+ "natural numbers is:"+sum);
    
}

   public static void main(String args[])throws IOException
  {
     add a=new add();
     a.sum(4);
  }
}

     