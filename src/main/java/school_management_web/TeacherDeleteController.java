package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.TeacherDeleteDao;
import school_management_model.Teacher;

/**
 * Servlet implementation class TeacherDeleteController
 */
@WebServlet("/teachers-remove")
public class TeacherDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TeacherDeleteDao tdDao;

    public void init() {
        tdDao = new TeacherDeleteDao();
    }  
    
    public TeacherDeleteController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tid= request.getParameter("tid");
		String tname= request.getParameter("tname");
		Teacher tBean = new Teacher();
		tBean.setTid(tid);
        tBean.setTname(tname);
        try {
            if (tdDao.validate(tBean) >0) {
            	
//                HttpSession session = request.getSession();
//                session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tlastname",tlastname);
//                 session.setAttribute("tname",tname);
//                 session.setAttribute("tsubject",tsubject);
            	response.sendRedirect("teacher-delete-success.jsp");
            } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
            	response.sendRedirect("teacher-delete-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
