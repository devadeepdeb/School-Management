package school_management_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import school_management_model.Assignment;

public class AssignmentUpdateDao {

    public Integer validate(Assignment tBean) throws ClassNotFoundException {
        Integer rs = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/schooldb?useSSL=false", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("update assignment set tid = ?, cid = ?, sid = ?, stid = ?, where tid = ?")) {
        	//preparedStatement.setLong(1, tBean.getTid());
        	preparedStatement.setString(5, tBean.getTid());
            preparedStatement.setString(1, tBean.getTid());
            preparedStatement.setString(2, tBean.getCid());
            preparedStatement.setString(3, tBean.getSid());
            preparedStatement.setString(4, tBean.getStid());
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
