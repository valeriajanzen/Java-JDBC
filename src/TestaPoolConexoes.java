import br.com.alura.jdbc.ConnectionFactory;

import java.sql.SQLException;

public class TestaPoolConexoes {

    public void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 0; i < 20; i++) {
            connectionFactory.recuperarConexao();
            System.out.println("Conex numero:");
        }

    }
}
