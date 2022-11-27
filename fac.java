import java.util.Scanner;
public class fac
{
   public static void main(String args[])
   {
     int n,i,fact=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     n=sc.nextInt();
     for(i=0;i>=1;i--)
     {
        fact=fact*i;

     }

     System.out.println("\n factorial Result="+fact);
     }
     }
