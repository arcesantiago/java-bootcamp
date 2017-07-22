
public class LoginCreditCard implements Login {

	@Override
	public boolean signIn(String name, String code) {
		if (name != null && code.length() == 10) return true;
		else return false;
	}
	

}
