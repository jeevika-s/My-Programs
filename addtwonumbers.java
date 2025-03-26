import java.util.Scanner;

public class addtwonumbers{
 public static void main(String[] args){
   Scanner scan= new Scanner(System.in);

   System.out.print("enter first number:");
   int num1= scan.nextInt();

   System.out.print("enter second number:");
   int num2= scan.nextInt();

   int sum=num1+num2;
   System.out.println("the sum is:"+sum);
 }
}