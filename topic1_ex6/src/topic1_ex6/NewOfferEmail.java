package topic1_ex6;
//this class sets and gets new email type
public class NewOfferEmail implements EmailType {
	Email email;
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
		email.setSubject("New offer added");
	}

	@Override
	public void buildBody() {
		email.setBody("Happy hour 100% discount");
	}

	@Override
	public Email getEmail() {
		return email;
	}
}
