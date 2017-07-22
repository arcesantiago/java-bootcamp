package topic1_ex6;

public class EmailTest {
	public static void main(String[] args) {
		EmailType priceChanged = new PriceCangedEmail();//new email type
		EmailEngineer emailEngineer = new EmailEngineer(priceChanged);// new director
		Email email = emailEngineer.ConstructEmail("santiago@globant.com");// set new email
		SendEmailService sendEmailService = new SendEmailService();// new send email service
		sendEmailService.send(email);//test send email
	}
	
	


}
