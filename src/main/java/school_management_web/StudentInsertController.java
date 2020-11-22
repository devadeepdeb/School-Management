package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import school_management_dao.StudentInsertDao;
import school_management_model.Student;

/**
 * Servlet implementation class TeaherInsertController
 */
@WebServlet("/students-insert")
public class StudentInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private StudentInsertDao tDao;

	    public void init() {
	        tDao = new StudentInsertDao();
	    }  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsertController() {
        
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
		// TODO Auto-generated method stub
		String stid= request.getParameter("stid");
		String stname= request.getParameter("stname");
		Student tBean = new Student();
		tBean.setStid(stid);
        tBean.setStname(stname);
        try {
            if (tDao.validate(tBean) >0) {
            	
            	response.sendRedirect("students-insert-success.jsp");
            } else {
          
            	response.sendRedirect("students-insert-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
