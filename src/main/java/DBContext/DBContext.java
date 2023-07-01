/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NguyenTheAnh
 */
public class DBContext {
    public static Connection makeConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=VNH2";
        conn = DriverManager.getConnection(URL, "sa", "12345");
        return conn;
    }
}
