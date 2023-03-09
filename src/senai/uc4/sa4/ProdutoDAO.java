package senai.uc4.sa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDAO {
    public void create (Produto produto) {
        Connection conexao = ConexaoMySQL.iniciarConexao();
        String sql = "INSERT INTO produtos (nome, preco, quantidade_estoque) VALUES (?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidadeEstoque());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
