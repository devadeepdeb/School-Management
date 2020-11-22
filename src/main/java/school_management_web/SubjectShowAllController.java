package school_management_web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import school_management_dao.SubjectShowAllDao;
import school_management_dao.SubjectUpdateDao;
import school_management_model.Subject;

/**
 * Servlet implementation class TeacherShowAllController
 */
@WebServlet("/subjects-show")
public class SubjectShowAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String url= "jdbc:mysql://localhost:3306/schooldb?useSSL=false";
	String usrname= "root";
	String pass= "";
	String sql2= "select * from subject";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private SubjectShowAllDao tsDao;

    public void init() {
        tsDao = new SubjectShowAllDao();
    } 
    public SubjectShowAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, usrname, pass);
			PreparedStatement st= con.prepareStatement(sql2);
			ResultSet rs= st.executeQuery();
			out.print("<html>");
			out.print("<body bgcolor= rgb(255,20,50)>");
			out.print("<center>");
			out.print("<table width=50% border=1>");  
			out.print("<caption><h1>Subjects Data</h1></caption>");
			ResultSetMetaData col= (ResultSetMetaData) rs.getMetaData();
			int t= col.getColumnCount();
			out.print("</tr>"); 
			for(int i=1; i<=t; ++i)
			{
				out.println("<th>"+col.getColumnName(i)+"</th>");
			}
			while(rs.next())  
			{  
			out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");  
			}
			out.print("</table>");
			out.print("</center>");
			out.print("</body>");
			out.print("</html>");
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		}


}
