package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/santander";
    private static final String USUARIO = "usuario_java";  // Usuário padrão do XAMPP
    private static final String SENHA = "senha123";        // Senha padrão (vazia por padrão)

    public static Connection conectar() {
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão bem-sucedida!");
            return conexao;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados.");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conexao = conectar();
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("Conexão fechada com sucesso.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
