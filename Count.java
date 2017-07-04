# digits
import java.io.*;
import java.util.*;
public class Count
{
  public static void main(String args[])
  {
    int i=0,x;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the integer");
    x=sc.nextInt();
    while(x>0)
    {
      x=x/10;
      ++i;
      
    }
    System.out.println("The no of digits present:"+i);
  }
}
