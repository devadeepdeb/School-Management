package school_management_web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import school_management_model.Admin;
import school_management_dao.AdminDao;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/login")
public class AdminLoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AdminDao loginDao;

    public void init() {
        loginDao = new AdminDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin loginBean = new Admin();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                HttpSession session = request.getSession();
                 session.setAttribute("username",username);
                response.sendRedirect("login-success.jsp");
            } else {
//                HttpSession session = request.getSession();
//                session.setAttribute("username", username);
                response.sendRedirect("login-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}