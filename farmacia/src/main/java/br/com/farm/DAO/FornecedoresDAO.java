package br.com.farm.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.farm.domain.Fornecedores;
import br.com.farm.factory.ConexaoFactory;

public class FornecedoresDAO {

	public void salvar(Fornecedores f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO fornecedores ");
		sql.append("(descricao) ");
		sql.append("VALUES (?)");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement inserir = conexao.prepareStatement(sql.toString());

		inserir.setString(1, f.getDescricao());
		inserir.executeUpdate();
	}

	public void excluir(Fornecedores f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM Fornecedores ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement del = conexao.prepareStatement(sql.toString());
		del.setLong(1, f.getCodigo());
		del.executeUpdate();
	}

	public void editar(Fornecedores f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE Fornecedores ");
		sql.append("SET descricao = ? ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement upd = conexao.prepareStatement(sql.toString());
		upd.setString(1, f.getDescricao());
		upd.setLong(2, f.getCodigo());
		upd.executeUpdate();
	}

	public Fornecedores buscarPorCodigo(Fornecedores f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, descricao ");
		sql.append("FROM fornecedores ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement selectCod = conexao.prepareStatement(sql.toString());
		selectCod.setLong(1, f.getCodigo());

		ResultSet result = selectCod.executeQuery();
		Fornecedores retorno = null;

		if (result.next()) {
			retorno = new Fornecedores();
			retorno.setCodigo(result.getLong("codigo"));
			retorno.setDescricao(result.getString("descricao"));
		}

		return retorno;
	}

	public ArrayList<Fornecedores> listar() throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, descricao ");
		sql.append("FROM fornecedores ");
		sql.append("ORDER BY codigo ASC");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement selectCod = conexao.prepareStatement(sql.toString());

		ResultSet result = selectCod.executeQuery();

		ArrayList<Fornecedores> lista = new ArrayList<Fornecedores>();

		while (result.next()) {
			Fornecedores f = new Fornecedores();
			f.setCodigo(result.getLong("codigo"));
			f.setDescricao(result.getString("descricao"));

			lista.add(f);
		}

		return lista;
	}

	public ArrayList<Fornecedores> buscarPorDescricao(Fornecedores f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, descricao ");
		sql.append("FROM fornecedores ");
		sql.append("WHERE descricao LIKE ? ");
		sql.append("ORDER BY descricao ASC");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement busca = conexao.prepareStatement(sql.toString());
		busca.setString(1, "%" + f.getDescricao() + "%");

		ResultSet result = busca.executeQuery();

		ArrayList<Fornecedores> lista = new ArrayList<Fornecedores>();

		while (result.next()) {
			Fornecedores item = new Fornecedores();
			item.setCodigo(result.getLong("codigo"));
			item.setDescricao(result.getString("descricao"));

			lista.add(item);
		}

		return lista;
	}

	public static void main(String[] args) {
		// TESTE DE INSERÇÃO

		/*
		 * Fornecedores f1 = new Fornecedores(); f1.setDescricao("Americanas");
		 * Fornecedores f2 = new Fornecedores(); f2.setDescricao("Submarino");
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { fdao.salvar(f1); fdao.salvar(f2);
		 * System.out.println("Inserido com sucesso!"); } catch (SQLException e) { //
		 * //TODO Auto-generated catch block System.out.println("Erro ao inserir");
		 * e.printStackTrace(); }
		 */

		// TESTE DE EXCLUSÃO
		/*
		 * Fornecedores f3 = new Fornecedores(); f3.setCodigo(2L);
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { fdao.excluir(f3); System.out.println("Deletado com sucesso!"); } catch
		 * (SQLException e) { System.out.println("Erro ao deletar");
		 * e.printStackTrace(); }
		 */

		// TESTE ATUALIZAÇÃO
		/*
		 * Fornecedores f4 = new Fornecedores(); f4.setCodigo(1L);
		 * f4.setDescricao("Casas Bahia");
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { fdao.editar(f4); System.out.println("aTUALIZADO com sucesso!"); } catch
		 * (SQLException e) { System.out.println("Erro ao atualizar");
		 * e.printStackTrace(); }
		 */

		// TESTE DE EDIÇÃO
		/*
		 * Fornecedores f5 = new Fornecedores(); f5.setCodigo(1L);
		 * f5.setDescricao("Casas Bahia");
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { fdao.editar(f5); System.out.println("aTUALIZADO com sucesso!"); } catch
		 * (SQLException e) { System.out.println("Erro ao atualizar");
		 * e.printStackTrace(); }
		 */

		// TESTE EXIBIÇÃO POR CÓDIGO
		/*
		 * Fornecedores f6 = new Fornecedores(); f6.setCodigo(1L);
		 * 
		 * Fornecedores f7 = new Fornecedores(); f7.setCodigo(3L);
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { Fornecedores fn1 = fdao.buscarPorCodigo(f6); Fornecedores fn2 =
		 * fdao.buscarPorCodigo(f7);
		 * 
		 * System.out.println("Resultado 1: "+fn1);
		 * System.out.println("Resultado 2: "+fn2);
		 * 
		 * } catch (SQLException e) { System.out.println("Erro ao atualizar");
		 * e.printStackTrace(); }
		 */

		// TESTE LISTANDO TUDO
		/*
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try {
		 * 
		 * ArrayList<Fornecedores>lista = fdao.listar();
		 * 
		 * for(Fornecedores f : lista) { System.out.println("Resultado: " + f); }
		 * 
		 * } catch (SQLException e) { System.out.println("Erro ao Listar dados");
		 * e.printStackTrace(); }
		 */

		/*
		 * Fornecedores f8 = new Fornecedores(); f8.setDescricao("Casas");
		 * 
		 * FornecedoresDAO fdao = new FornecedoresDAO();
		 * 
		 * try { ArrayList<Fornecedores> lista = fdao.buscarPorDescricao(f8);
		 * 
		 * for (Fornecedores f : lista) { System.out.println("Resultado: " + f); }
		 * 
		 * } catch (SQLException e) { System.out.println("Erro ao busca dados");
		 * e.printStackTrace(); }
		 */

	}

}
