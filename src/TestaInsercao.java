
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.transform.Result;


public class TestaInsercao {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricacao) VALUES ('Mouse', 'Mouse sem fio')"
                , Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("Id criado:" + id);

        }
    }
}
