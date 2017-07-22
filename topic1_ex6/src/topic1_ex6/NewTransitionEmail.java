package topic1_ex6;
// this class sets and gets new email type
public class NewTransitionEmail implements EmailType{
	Email email;
	
	public NewTransitionEmail() {
		email = new Email();
	}

	@Override
	public void buildTo(String to) {
		email.setTo(to);
		
	}

	@Override
	public void buildFrom() {
		email.setFrom("BuyCart@hotmail.com");
		
	}

	@Override
	public void buildSubject() {
		email.setSubject("New transaction");
		
	}

	@Override
	public void buildBody() {
		email.setBody("transaction++");
		
	}

	@Override
	public Email getEmail() {
		return email;
	}

}
