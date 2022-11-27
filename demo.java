import java.util.Scanner;
class A
{
  public void methodA()
  {
    System.out.println("base class method");
    }
}
 class B extends A
 {
   public void methodB()
   {
       System.out.println("child class method");
       }
       }
 class demo
 {
   public static void main(String args[])
   {
      B obj=new B();
      obj.methodA();
      obj.methodB();
      }

      }