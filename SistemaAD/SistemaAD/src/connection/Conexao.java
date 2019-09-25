package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/AD";
    private static final String USER = "postgres";
    private static final String PASS = "123";

    public static Connection getConnection() {
        try {
            System.out.println("Você esta conectado!");
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexao", e);
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
