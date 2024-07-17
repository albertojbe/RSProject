package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL {

    public static Connection getConnection() {
        final String url = "jdbc:mysql://localhost:3306/RS-Project";
        final String user = "root";
        final String password = "96413524";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void closeConnection(Connection connection) {
        try{
            if(connection != null){
                connection.close();
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
