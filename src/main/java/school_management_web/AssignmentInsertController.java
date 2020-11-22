package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import school_management_dao.AssignmentInsertDao;
import school_management_model.Assignment;

/**
 * Servlet implementation class TeaherInsertController
 */
@WebServlet("/assignments-insert")
public class AssignmentInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private AssignmentInsertDao tDao;

	    public void init() {
	        tDao = new AssignmentInsertDao();
	    }  
    /**
     * @see HttpServlet#HttpServlet()
     */

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
            if (tDao.validate(tBean) >0) {
            	
            	response.sendRedirect("assignments-insert-success.jsp");
            } else {
          
            	response.sendRedirect("assignments-insert-failure.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
