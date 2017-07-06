# re6
import java.io.*;
import java.util.*;
public class Odd
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,a=50;
    System.out.println("Enter a odd number");
    a=sc.nextInt();
    for(i=1;i<=a;i++)
    if(i%2!=0)
    System.out.println(i+"");
  }
}
