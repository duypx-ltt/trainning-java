package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import validator.Validator;

public class DemoSession extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Validator val = new Validator();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mail = request.getParameter("username");
		String pass = request.getParameter("password");
		if (val.EmailValidator(mail) == true && val.PassValidator(pass) == true) {
			HttpSession session = request.getSession();
			session.setAttribute("username", mail);
			Cookie mailCookies = new Cookie("mailCookie", mail);
			Cookie passCookies = new Cookie("passCookie", pass);
			if (request.getParameter("remember") != null) {
				mailCookies.setMaxAge(60 * 60 * 24);
				passCookies.setMaxAge(60 * 60 * 24);
			} else {
				mailCookies.setMaxAge(0);
				passCookies.setMaxAge(0);
			}
			response.addCookie(mailCookies);
			response.addCookie(passCookies);
			response.sendRedirect("index.jsp");
		} else {
			request.setAttribute("message", "Acount is invalid!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	// Xoa session khi logout
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // To change body of generated methods, choose Tools | Templates.
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		response.sendRedirect("login.jsp");
	}
}
