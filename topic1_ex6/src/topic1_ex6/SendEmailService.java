package topic1_ex6;
//this method send a message
public class SendEmailService {
	Email email;
	
	public SendEmailService() {
		email = new Email();
	}
	
	public Email send(Email email){
		this.email = email;
		return this.email;
	}

}
