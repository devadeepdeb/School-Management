package school_management_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_management_dao.ClasDeleteDao;
import school_management_model.Clas;
import school_management_model.Subject;
/**
 * Servlet implementation class SubjectDeleteController
 */
@WebServlet("/classes-remove")
public class ClasDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClasDeleteDao tdDao;

    public void init() {
        tdDao = new ClasDeleteDao();
    }  
    public ClasDeleteController() {
        
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
		            if (tdDao.validate(tBean) >0) {
		            	
//		                HttpSession session = request.getSession();
//		                session.setAttribute("tfirstname",tfirstname);
//		                 session.setAttribute("tfirstname",tfirstname);
//		                 session.setAttribute("tlastname",tlastname);
//		                 session.setAttribute("tname",tname);
//		                 session.setAttribute("tsubject",tsubject);
		            	response.sendRedirect("classes-delete-success.jsp");
		            } else {
		                //HttpSession session = request.getSession();
		                //session.setAttribute("user", username);
		            	response.sendRedirect("classes-delete-failure.jsp");
		            }
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
			}

}
