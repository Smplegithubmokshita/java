import java.util.Scanner;
class string
{
public static void main(String args[])
{
   String first="Hello";
   String second="world";
   String third="world";
   System.out.println("first string is:-"+first);
   System.out.println("second string is:-  "+second);
   char ch=first.charAt(0);
   System.out.println("character at:-"+ch);
   String upperStr=first.toUpperCase();
   System.out.println("To upper case is:-  "+upperStr);
   String lowerStr=second.toLowerCase();
   System.out.println("To lower case is:-  "+lowerStr);
   String join=first.concat(second);
   System.out.println("join string:-   "+join);
   int legth=first.length();
   System.out.println("Length of string is:- "+legth);
   boolean result1=first.equals(second);
   System.out.println("String first and second are equal:-    "+result1);
   boolean result2=second.equals(third);
   System.out.println("String second and third are equal:-    "+result2);
   }
   }