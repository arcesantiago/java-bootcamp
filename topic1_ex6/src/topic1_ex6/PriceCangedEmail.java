package topic1_ex6;

public class PriceCangedEmail implements EmailType{
	Email email;
	
	public PriceCangedEmail() {
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
		email.setSubject("New item added");
		
	}

	@Override
	public void buildBody() {
		email.setBody("x item added");
		
	}

	@Override
	public Email getEmail() {
		return email;
	}
	

}
