/**
 * 
 */
function validateFormRES() {
	var i = 0;
	var result = true;
	var email = document.getElementById("email").value;
	var pass = document.getElementById("pwd").value;
	var passConfirm = document.getElementById("pwd_confirm").value;
	var email_regex = /^[a-zA-Z0-9]+[A-Za-z0-9_]*@[a-zA-Z0-9]+\.?[a-zA-Z]{2,3}\.[A-Za-z]{2,3}$/;
	var pass_regex = /^[a-zA-Z0-9]{6,50}$/;
	if (email_regex.test(email) != true) {
		document.getElementById("email_error").innerHTML = "your email is invalid";
		i++;
	}
	if (pass_regex.test(pass) != true) {
		document.getElementById("pass_error").innerHTML = "your password is invalid";
		i++;
	}
	if (passConfirm != pass) {
		document.getElementById("passConfirm_error").innerHTML = "your password confirm is invalid";
		i++;
	}
	if (i == 0) {
		result = true;
	} else {
		result = false;
	}
	return result;
}

function validateFormLOG() {
	var i = 0;
	var result = true;
	var email = document.getElementById("email").value;
	var pass = document.getElementById("pwd").value;
	var email_regex = /^[a-zA-Z0-9]+[A-Za-z0-9_]*@[a-zA-Z0-9]+\.?[a-zA-Z]{2,3}\.[A-Za-z]{2,3}$/;
	var pass_regex = /^[a-zA-Z0-9]{6,50}$/;
	if (email_regex.test(email) != true) {
		document.getElementById("email_error").innerHTML = "your email is invalid";
		i++;
	}
	if (pass_regex.test(pass) != true) {
		document.getElementById("pass_error").innerHTML = "your password is invalid";
		i++;
	}
	if (i == 0) {
		result = true;
	} else {
		result = false;
	}
	return result;
}