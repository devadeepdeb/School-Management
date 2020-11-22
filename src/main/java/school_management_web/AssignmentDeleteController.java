package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.AssignmentDeleteDao;
import school_management_model.Assignment;
/**
 * Servlet implementation class SubjectDeleteController
 */
@WebServlet("/assignments-remove")
public class AssignmentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AssignmentDeleteDao tdDao;

    public void init() {
        tdDao = new AssignmentDeleteDao();
    }  
    public AssignmentDeleteController() {
        
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
		String tid= request.getParameter("tid");
		String cid= request.getParameter("cid");
		String sid= request.getParameter("sid");
		String stid= request.getParameter("stid");
		Assignment tBean = new Assignment();
		tBean.setTid(tid);
		tBean.setCid(cid);
		tBean.setSid(sid);
		tBean.setStid(stid);
        try {
            if (tdDao.validate(tBean) >0) {
            	
//                HttpSession session = request.getSession();
//                session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tfirstname",tfirstname);
//                 session.setAttribute("tlastname",tlastname);
//                 session.setAttribute("tname",tname);
//                 session.setAttribute("tsubject",tsubject);
            	response.sendRedirect("assignments-delete-success.jsp");
            } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
            	response.sendRedirect("assignments-delete-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

}
