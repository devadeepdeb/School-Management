package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.StudentUpdateDao;
import school_management_model.Clas;
import school_management_model.Student;

/**
 * Servlet implementation class TeacherUpdateController
 */
@WebServlet("/students-update")
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentUpdateDao tuDao;

    public void init() {
        tuDao = new StudentUpdateDao();
    }  
    public StudentUpdateController() {
        
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
		String stid= request.getParameter("stid");
		String stname= request.getParameter("stname");
		Student tBean = new Student();
		tBean.setStid(stid);
        tBean.setStname(stname);
        try {
            if (tuDao.validate(tBean) >0) {
            	
//                HttpSession session = request.getSession();
//                session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tlastname",tlastname);
//                 session.setAttribute("tname",tname);
//                 session.setAttribute("tsubject",tsubject);
            	response.sendRedirect("students-update-success.jsp");
            } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
            	response.sendRedirect("students-update-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
