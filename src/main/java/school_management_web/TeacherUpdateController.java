package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.TeacherUpdateDao;
import school_management_model.Teacher;

/**
 * Servlet implementation class TeacherUpdateController
 */
@WebServlet("/teachers-existing")
public class TeacherUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TeacherUpdateDao tuDao;

    public void init() {
        tuDao = new TeacherUpdateDao();
    }  
    public TeacherUpdateController() {
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
            if (tuDao.validate(tBean) >0) {
            	
//                HttpSession session = request.getSession();
//                session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tlastname",tlastname);
//                 session.setAttribute("tname",tname);
//                 session.setAttribute("tsubject",tsubject);
            	response.sendRedirect("teacher-update-success.jsp");
            } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
            	response.sendRedirect("teacher-update-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
