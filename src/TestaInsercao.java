import br.com.alura.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricacao) VALUES ('Mouse', 'Mouse sem fio'");

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next()) {

        }
    }
}
