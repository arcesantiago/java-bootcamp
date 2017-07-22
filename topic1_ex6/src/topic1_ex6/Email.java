package topic1_ex6;
//this class sets and gets an new email
public class Email {
	private String from;
	private String to;
	private String subject;
	private String body;
	
	public void setTo(String to){
		this.to = to;
	}
	
	public void setFrom(String from){
		this.from = from;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	public void setBody(String body){
		this.body = body;
	}
	
	public String toString(){
		return to + "\n" + from + "\n" + subject + "\n" + body;
	}

}
