package br.com.alura.jdbc;

import br.com.alura.ProdutoDAO;
import br.com.alura.Produto;
import br.com.alura.ProdutoDAO;

import java.sql.*;

public class TestaInsercaoComProduto {

    public static void main (String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

        try(Connection connection = new ConnectionFactory().recuperarConexao()) {
            ProdutoDAO ProdutoDao = new ProdutoDAO(connection);
                   ProdutoDao.salvar(comoda);
        }
    }
}
