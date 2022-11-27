import java.util.Scanner;
public class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int Number,originalNumber,remainder,result=0;
System.out.println("Enter the number");
Number=sc.nextInt();
originalNumber=Number;
while(originalNumber!=0)
{
   remainder=originalNumber%10;
   result+=Math.pow(remainder,3);
   originalNumber/=10;
   }
   if(result==Number)
   System.out.println(Number+"is an armstrong number");
   else
   System.out.println(Number+"is not an armstrong number");
   }
   }