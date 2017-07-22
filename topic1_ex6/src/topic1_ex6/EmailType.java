package topic1_ex6;
//interface whit methods 
public interface EmailType {
	void buildTo(String to);
	void buildFrom();
	void buildSubject();
	void buildBody();
	Email getEmail();
}
