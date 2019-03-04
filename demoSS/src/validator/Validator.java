package validator;

public class Validator {
	public String EMAIL_REGEX = "^([\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]){0,255}$";

	public boolean EmailValidator(String email) {
		return email.matches(EMAIL_REGEX);
	}

	public boolean PassValidator(String email, String pass) {
		String[] s = email.split("\\@", 0);
		String s1 = s[0] + "123";
		return pass.equals(s1);
	}

}
