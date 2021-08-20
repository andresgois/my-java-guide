package br.com.farm.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.farm.domain.Fornecedores;
import br.com.farm.domain.Produtos;
import br.com.farm.factory.ConexaoFactory;

public class ProdutoDAO {

	
	public void salvar(Produtos p) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO produtos ");
		sql.append("(descricao, preco, quantidade, fornecedores_codigo) ");
		sql.append("VALUES (?,?,?,?)");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement inserir = conexao.prepareStatement(sql.toString());

		inserir.setString(1, p.getDesricao());
		inserir.setDouble(2, p.getPreco());
		inserir.setLong(3, p.getQuantidade());
		inserir.setLong(4, p.getFabricante().getCodigo());
		inserir.executeUpdate();
	}
	
	
	public ArrayList<Produtos> listar() throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT P.codigo, P.descricao, P.quantidade, P.preco, P.fornecedores_codigo, F.descricao ");
		sql.append("FROM sistema.produtos P ");
		sql.append("INNER JOIN sistema.fornecedores F ON  P.fornecedores_codigo = F.codigo");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement selectCod = conexao.prepareStatement(sql.toString());

		ResultSet result = selectCod.executeQuery();

		ArrayList<Produtos> lista = new ArrayList<Produtos>();

		while (result.next()) {
			Fornecedores f = new Fornecedores();
			f.setCodigo(result.getLong("P.fornecedores_codigo"));
			f.setDescricao(result.getString("F.descricao"));
			
			Produtos p = new Produtos();
			p.setCodigo(result.getLong("P.codigo"));
			p.setDesricao(result.getString("P.descricao"));
			p.setPreco(result.getDouble("P.preco"));
			p.setQuantidade(result.getLong("P.quantidade"));				
			p.setFabricante(f);

			lista.add(p);
		}

		return lista;
	}
	
	public void excluir(Produtos p) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM produtos ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement del = conexao.prepareStatement(sql.toString());
		del.setLong(1, p.getCodigo());
		del.executeUpdate();
	}
	
	public void editar(Produtos p) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE produtos ");							 
		sql.append("SET descricao = ?, preco = ?, quantidade = ?, fornecedores_codigo = ? ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement upd = conexao.prepareStatement(sql.toString());
		upd.setString(1, p.getDesricao());
		upd.setDouble(2, p.getPreco());
		upd.setLong(3, p.getQuantidade());
		upd.setLong(4, p.getFabricante().getCodigo());
		upd.setLong(5, p.getCodigo());
		upd.executeUpdate();
	}
	
}
