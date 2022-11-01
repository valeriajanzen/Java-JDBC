package br.com.alura.jdbc;

import br.com.alura.Categoria;
import br.com.alura.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection connection;

    public CategoriaDAO(Connection connection) {

    }
    public List<Categoria> listarComProduto() throws SQLException{
        Categoria ultima = null;
        List<Categoria> categorias = new ArrayList<>();

        System.out.println("Executando a query");

        String sql = "SELECT C.ID, C.NOME, P.ID, P.NOME, P.DESCRICAO FROM CATEGORIA C INNER JOIN"
                + "PRODUTO P ON C.ID = P.CATEGORIA_ID";

        try(PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try(ResultSet rst = pstm.getResultSet()) {
                while(rst.next()) {
                    if(ultima == null || !ultima.getNome().equals(rst.getString(2))) {
                        Categoria categoria =
                                new Categoria(rst.getInt(1), rst.getString(2));

                        ultima = categoria;
                        categorias.add(categoria);
                    }
                    Produto produto
                            = new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
                    ultima.adicionar(produto);
                }
            }
        }
        return categorias;
    }
}
