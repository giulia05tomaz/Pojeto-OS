package br.com.os.dal;
import java.sql.*;
public class Mconectar {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        //carrega o driver do BD
        String driver = "com.mysql.jdbc.Driver";

        //armazena o caminho do BD
        String url = "jdbc:mysql://localhost:3306/dbos";

        //autenticaÃ§Ã£o
        String user = "root";
        String password = "";

        //estabelecer coneÃ§Ã£o "Crtl+space"" e tartar erros
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }

}
