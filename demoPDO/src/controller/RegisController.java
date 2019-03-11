package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserBean;
import daos.UserDao;

/**
 * Servlet implementation class RegisController
 */
@WebServlet("/RegisController")
public class RegisController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisController() {
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
            java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
            userBean.setCreatAt(d);
            userBean.setUpdateAt(d);

            // check account exist
            UserDao userDao = new UserDao();
            boolean check = userDao.checkEmail(userBean);
            if (check) {
                request.setAttribute("message", "Email is existed!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            } else {
                userDao.insert(userBean);
                request.setAttribute("message", "Register success!");
                request.setAttribute("mail", email);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (Exception ex) {
        }
    }

}
