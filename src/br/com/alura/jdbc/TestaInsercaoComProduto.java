package br.com.alura.jdbc;

import br.com.alura.PersistenciaProduto;
import br.com.alura.Produto;

import java.sql.*;

public class TestaInsercaoComProduto {

    public static void main (String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

        try(Connection connection = new ConnectionFactory().recuperarConexao()) {
            PersistenciaProduto persistenciaProduto = new PersistenciaProduto(connection);
                   persistenciaProduto.salvarProduto(comoda);
        }
    }
}
