package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import school_management_dao.TeacherInsertDao;
import school_management_model.Teacher;

/**
 * Servlet implementation class TeaherInsertController
 */
@WebServlet("/teachers-insert")
public class TeacherInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private TeacherInsertDao tDao;

	    public void init() {
	        tDao = new TeacherInsertDao();
	    }  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherInsertController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tid= request.getParameter("tid");
		String tname= request.getParameter("tname");
		Teacher tBean = new Teacher();
		tBean.setTid(tid);
        tBean.setTname(tname);
        try {
            if (tDao.validate(tBean) >0) {
            	
            	response.sendRedirect("teacher-insert-success.jsp");
            } else {
          
            	response.sendRedirect("teacher-insert-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
