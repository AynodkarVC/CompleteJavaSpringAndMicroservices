package clases.JDBC;

import java.sql.*;

public class InsertValue {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/JdbcDemo";
        String name = "root";
        String pass = "Asphalt8@";
        String query = "insert into students values (4,'Michel')";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        String userData = " ";
        System.out.println(rs+ " rows affected");

        st.close();
        con.close();
    }
}
