public class ATM{
	public static void main(String[] args){
	double balance=1000.00;
	double withdrawAmount=1500.00;
	try{
		if(withdrawAmount>balance){
		throw new Exception ("Insufficient balance");
		}
			balance=withdrawAmount;
		System.out.println("withdrawl successful remaining balance:"+balance);
		}catch(Exception e){
		System.out.println("error:"+ e.getMessage());
		}
  	}
}