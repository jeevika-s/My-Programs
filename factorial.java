import java.util.Scanner;

public class factorial{
 public static void main(String[]args){
  Scanner scan=new Scanner(System.in);
  System.out.print("enter a number:");
  int num=scan.nextInt(); 

  int factorial = 1;
  for(int i=1;i<=num;i++){
   factorial*=i;
   }
   System.out.println("the factorial of "+num+" is "+factorial);
 }
}