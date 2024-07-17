package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConexaoSQL;
import Model.Abrigo;

public class AbrigoDAO {
    public void cadastrar(Abrigo abrigo) {
        String sql = "INSERT INTO abrigos (nome, endereco, responsavel, telefone, email, capacidade, ocupacao) values (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConexaoSQL.getConnection().prepareStatement(sql);
            ps.setString(1, abrigo.getNome());
            ps.setString(2, abrigo.getEndereco());
            ps.setString(3, abrigo.getResponsavel());
            ps.setString(4, abrigo.getTelefone());
            ps.setString(5, abrigo.getEmail());
            ps.setString(6, String.valueOf(abrigo.getCapacidade()));
            ps.setString(7, String.valueOf(abrigo.getOcupacao()));
            System.out.println(ps.executeUpdate());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deletar(String id) {
        String sql = "DELETE FROM abrigos WHERE idabrigos = ?";

        PreparedStatement ps = null;

        try {
            ps = ConexaoSQL.getConnection().prepareStatement(sql);
            ps.setString(1, id);
            System.out.println(ps.executeUpdate());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
