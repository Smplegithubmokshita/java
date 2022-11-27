import java.util.Scanner;
class fibonacci
{
public static void main(String [] args)
{
  int n=100,first=0,second=1;
  System.out.println("fibonacci series upto"+n+":");
  while(first<=n){
  System.out.print(first +",");
  int next=first+second;
  second=next;
  }
  }
  }