package interfaceSeggregationPrinciple;

import java.util.Random;

public class GooglePay implements UPIPayments{

	@Override
	public void payMoney(long amount, String phno) {
		System.out.println("Rupees "+amount+" paid to "+phno+" Via Google Pay");
	}

	@Override
	public void getScratchCard() {
		Random random=new Random();
		int n=random.nextInt(1, 100);
		System.out.println("You got a GooglePay Scratch Card Worth "+n);
		
	}

}
