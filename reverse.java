import java.util.Scanner;

public class reverseString{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);

  System.out.print("enter a string:");
  String input = scanner.next();

  String reversed= ".";
  for (int i=input.length()-1;i>=0;i--){
    reversed += input.charAt (i);
  }

  System.out.println("reversed string:"+reversed);
 }
}
