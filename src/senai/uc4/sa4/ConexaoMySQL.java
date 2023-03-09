package senai.uc4.sa4;

import java.sql.Connection;

public class ConexaoMySQL {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/app";
    private static String USER = "root";
    private static String PASS = "root";

    public static Connection iniciarConexao() {
        Connection conexao = null;
        try {
            Class.forName(DRIVER);
            conexao = java.sql.DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }
    public static void fecharConexao(Connection conexao) {
        if (conexao!= null)
        try {
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
