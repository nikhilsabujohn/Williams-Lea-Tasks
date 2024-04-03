package interfaceSeggregationPrinciple;

import java.util.Scanner;

public class PaymentController {
	public static void main(String[] args) {
	String phno="";
	int flag=1;
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Choose an Application "
			+"\n"+ "1.googlePay"
			+"\n"+ "2.Paytm");
	
	int choice=scanner.nextInt();

	while(flag!=0)
	{
	System.out.println("Enter Recipient Phone Number :");
	phno=scanner.next();
	int n=phno.length();
	//System.out.println(n);
	if(n<10 || n>10 )
	{
		System.out.println("Wrong number");
	}
	else if(n==10)
	{
		System.out.println("user Exist");
		flag=0;
	}
	
	}
	
	int amount;
	System.out.println("Enter Amount to Pay :" );
	amount=scanner.nextInt();
	
	if(choice==1)
	{
		GooglePay googlePay=new GooglePay();
		googlePay.payMoney(amount, phno);
		googlePay.getScratchCard();
	}
	else if(choice==2)
	{
		Paytm paytm=new Paytm();
		paytm.payMoney(amount, phno);
		paytm.getScratchCard();
		paytm.getCashBackAsCreditBalance();
	}
	

}
}
