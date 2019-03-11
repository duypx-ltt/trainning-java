package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserBean;
import daos.UserDao;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();
        session.removeAttribute("emailSS");
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            Cookie c = cookies[i];
            if (c.getName().equals("mailCookie") || c.getName().equals("passCookie")) {
                c.setMaxAge(0);
                c.setValue(null);
                response.addCookie(c);
            }
        }
        response.sendRedirect("login.jsp");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
            String email = request.getParameter("email");
            String pass = request.getParameter("pswd");

            // initialize user bean object
            UserBean userBean = new UserBean();
            userBean.setMailAdd(email);
            userBean.setPass(pass);

            // check account exist
            UserDao userDao = new UserDao();
            boolean checkpass = userDao.checkPass(userBean);
            boolean checkemail = userDao.checkEmail(userBean);

            // if pass incorrect
            if (checkemail && !checkpass) {
                request.setAttribute("mail", email);
                request.setAttribute("pass_incorrect", "Password was incorrect!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

            // if account was existed
            if (checkpass) {
                // save user email in session
                HttpSession session = request.getSession();
                session.setAttribute("emailSS", email);
                // init cookie
                Cookie mailCookies = new Cookie("mailCookie", email);
                Cookie passCookies = new Cookie("passCookie", pass);
                if (request.getParameter("remember") != null) {
                    mailCookies.setMaxAge(3600);
                    passCookies.setMaxAge(3600);
                } else {
                    mailCookies.setMaxAge(0);
                    passCookies.setMaxAge(0);
                }
                response.addCookie(mailCookies);
                response.addCookie(passCookies);
                response.sendRedirect("index.jsp");
            } else {
                // account not exist
                request.setAttribute("message", "Acount is not exist!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

        } catch (Exception ex) {
        }

    }

}
