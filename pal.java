import java.util.Scanner;
class pal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,reversedNum=0,remainder;
System.out.println("enter the number");
num=sc.nextInt();

int originalNum=num;

while(num!=0){
remainder=num%10;
reversedNum=reversedNum*10+remainder;
num/=10;
}
if(originalNum==reversedNum){
System.out.println(originalNum+"is palindrome.");
}
else{
System.out.println(originalNum+"is not palindrome");
}
}
}