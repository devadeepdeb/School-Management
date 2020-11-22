package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import school_management_dao.ClasInsertDao;
import school_management_model.Clas;
import school_management_model.Teacher;

/**
 * Servlet implementation class TeaherInsertController
 */
@WebServlet("/classes-insert")
public class ClasInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ClasInsertDao tDao;

	    public void init() {
	        tDao = new ClasInsertDao();
	    }  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasInsertController() {
        
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
				String cid= request.getParameter("cid");
				String cname= request.getParameter("cname");
				Clas tBean = new Clas();
				tBean.setCid(cid);
		        tBean.setCname(cname);
		        try {
		            if (tDao.validate(tBean) >0) {
		            	
		            	response.sendRedirect("classes-insert-success.jsp");
		            } else {
		          
		            	response.sendRedirect("classes-insert-failure.jsp");
		            }
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
		    }

}
