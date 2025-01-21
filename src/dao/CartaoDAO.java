package dao;

import model.CartaoModel;
import connection.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CartaoDAO {

    public List<CartaoModel> listarTodos() {
        List<CartaoModel> cartoes = new ArrayList<>();
        String sql = "SELECT id, numero, nomeTitular, dataExpiracao, cvv FROM cartao";

        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                CartaoModel cartao = new CartaoModel();
                cartao.setId(rs.getInt("id"));
                cartao.setNumero(rs.getString("numero"));
                cartao.setNomeTitular(rs.getString("nomeTitular"));
                cartao.setDataExpiracao(rs.getString("dataExpiracao"));
                cartao.setCvv(rs.getInt("cvv"));

                cartoes.add(cartao);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar cartões: " + e.getMessage());
            e.printStackTrace();
        }
        return cartoes;
    }
}

