package openClosedPrinciple;

import java.util.Scanner;

public class NotificationController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.SMS"
				+"\n"+ "2.whatsapp");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			SMSNotification notification=new SMSNotification();
			notification.sendOTP();
		}
		else if (choice==2) 
		{
			WhatsappNotification notification=new WhatsappNotification();
			notification.sendOTP();
		}
		else
		{
			System.err.println("invalid choice");
		}
	}

}
