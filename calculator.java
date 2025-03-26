import java.util.Scanner;
public class calculator{
   public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);

     System.out.print("enter first number:");
     double num1=scanner.nextDouble();

     System.out.print("enter second number:");
     double num2=scanner.nextDouble();

     System.out.print("choose operation(+,-,*,/)");
     char operator =scanner.next().charAt(0);
     double result=0;

     switch (operator){
       case'+':
         result=num1+num2;
         System.out.println("the result is:" + result);
         break;
       case'-':
         result=num1-num2;
         System.out.println("the result is:" + result);
         break;
       case'*':
         result=num1*num2;
         System.out.println("the result is:" + result);
         break;
       case'/':
         if(num2!=0){
         result=num1/num2;
         System.out.println("the result is:" + result);
         }else{
           System.out.println("invalid operator");
           return;
         }
         
    }
}
}