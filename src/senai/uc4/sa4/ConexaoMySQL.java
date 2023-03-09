package senai.uc4.sa4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;


public class ConexaoMySQL {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/app";
    private static String USER = "root";
    private static String PASS = "root";

    public static Connection iniciarConexao() {

        try {
            Class.forName(DRIVER);
            return  DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na Conexão"+ e);

        }

    }
    public static void fecharConexao(Connection connection, PreparedStatement stmt) {
       fecharConexao(connection,stmt);
        try {
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void fecharConexao(Connection connection, PreparedStatement stmt, ResultSetMetaData rs) {
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
