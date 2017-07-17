
public class LoginPaypal implements Login{

	@Override
	public boolean signIn(String user, String password) {
		if (user == "santiago@hotmail.com" && password == "football123") return true;
		else return false;
	}
	

}
