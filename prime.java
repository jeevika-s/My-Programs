import java.util.Scanner;

public class primecheck{
 public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  
  System.out.print("enter a number:");
  int num=scan.nextInt();
  Boolean isprime=true;

  if(num<=1){
    isprime=false;
  }else{
    for(int i=2;i<=num/2;i++){
     if (num%1==0){
       isprime=false;
       break;
     }
   }
}
if (isprime){
 System.out.println(num+" is a prime number");
}else{
 System.out.println(num+" is not a prime number");
}
}}