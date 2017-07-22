package topic1_ex6;
// this class sets a new email type
public class EmailEngineer {
	private EmailType emailType;
	//T
	public EmailEngineer (EmailType emailType){
		this.emailType = emailType;
	}
	//
	public Email ConstructEmail(String to){
		
		emailType.buildBody();
		emailType.buildFrom();
		emailType.buildSubject();
		emailType.buildTo(to);
		return emailType.getEmail();
		
	}

}
