package dependencyInversionPrinciple;

public class DebitCard implements BankCards{

	@Override
	public void doPayment(String produc,int amount) {
		System.out.println("Rupees "+amount+" For "+produc+" is paid through DEBITCARD");
		
	}

}
