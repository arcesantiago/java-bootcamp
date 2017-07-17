
public class LoginCreditCard implements Login {

	@Override
	public boolean signIn(String name, String code) {
		if (name == "santiago" && code == "20047419902013nw") return true;
		else return false;
	}
	

}
