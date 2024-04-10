package clases.JDBC;

import java.sql.*;
import java.util.Stack;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/JdbcDemo";
        String name = "root";
        String pass = "Asphalt8@";
        String query = "select username from student where userId = 3";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String userName = rs.getString("username");
        System.out.println(userName);
        st.close();
        con.close();
    }
}
