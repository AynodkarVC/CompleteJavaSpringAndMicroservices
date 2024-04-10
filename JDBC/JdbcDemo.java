package clases.JDBC;

import java.sql.*;
import java.util.Stack;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/JdbcDemo";
        String name = "root";
        String pass = "Asphalt8@";
        String query = "select * from students";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        String userData =" ";
        for (int i = 0; i <= 2; i++){
            rs.next();
            userData = rs.getInt(1)+" : "+rs.getString(2);
            System.out.println(userData);
       }

        st.close();
        con.close();
    }
}
