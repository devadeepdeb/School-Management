package school_management_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import school_management_model.Student;

public class StudentUpdateDao {

    public Integer validate(Student tBean) throws ClassNotFoundException {
        Integer rs = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/schooldb?useSSL=false", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("update student set stname = ? where stid = ?")) {
        	//preparedStatement.setLong(1, tBean.getTid());
        	preparedStatement.setString(2, tBean.getStid());
            preparedStatement.setString(1, tBean.getStname());
            //preparedStatement.executeUpdate();

            System.out.println(preparedStatement);
            rs = Integer.valueOf(preparedStatement.executeUpdate());
           // status = (ResultSet)rs.next();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return rs;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
            	System.out.println("Please enter appropriate data after checking values in table");
            }
        }
    }
}
