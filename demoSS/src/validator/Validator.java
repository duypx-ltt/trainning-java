package validator;

public class Validator {
	public String EMAIL_REGEX = "^([\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]){0,255}$";
	public String PASSWORD_REGEX = "^([\\w]*[\\w]){6,50}";

	public boolean EmailValidator(String email) {
		return email.matches(EMAIL_REGEX);
	}

	public boolean PassValidator(String pass) {
		return pass.matches(PASSWORD_REGEX);
	}

}
