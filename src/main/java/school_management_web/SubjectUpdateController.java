package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.SubjectUpdateDao;
import school_management_model.Subject;

/**
 * Servlet implementation class TeacherUpdateController
 */
@WebServlet("/subject-update")
public class SubjectUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SubjectUpdateDao tuDao;

    public void init() {
        tuDao = new SubjectUpdateDao();
    }  
    public SubjectUpdateController() {
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
		String sid= request.getParameter("sid");
		String sname= request.getParameter("sname");
		Subject tBean = new Subject();
		tBean.setSid(sid);
        tBean.setSname(sname);
        try {
            if (tuDao.validate(tBean) >0) {
            	
//                HttpSession session = request.getSession();
//                session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tlastname",tlastname);
//                 session.setAttribute("tname",tname);
//                 session.setAttribute("tsubject",tsubject);
            	response.sendRedirect("subject-update-success.jsp");
            } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
            	response.sendRedirect("subject-update-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
