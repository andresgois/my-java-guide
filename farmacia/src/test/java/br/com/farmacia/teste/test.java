package br.com.farmacia.teste;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farm.DAO.ProdutoDAO;
import br.com.farm.domain.Fornecedores;
import br.com.farm.domain.Produtos;

public class test {

	@Test
	@Ignore
	public void salvar() {
		// TESTE DE INSERÇÃO
		Produtos p1 = new Produtos();
		p1.setDesricao("Sapato");
		p1.setPreco(29.99);
		p1.setQuantidade(10L);

		Fornecedores f1 = new Fornecedores();
		f1.setCodigo(1L);
		p1.setFabricante(f1);

		try {
			ProdutoDAO pdao = new ProdutoDAO();
			pdao.salvar(p1);
			System.out.println("Inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void listar() throws SQLException {

		ProdutoDAO fdao = new ProdutoDAO();
		ArrayList<Produtos> lista = fdao.listar();

		for (Produtos pr : lista) {
			System.out.println(pr);
		}
	}

	@Test
	@Ignore
	public void excluir()throws SQLException {
		Produtos p = new Produtos();
		p.setCodigo(5L);

		ProdutoDAO pdao = new ProdutoDAO();
		pdao.excluir(p);
		System.out.println("Deletado com sucesso!");
		
	}
	
	@Test
	public void editar()throws SQLException {
		Produtos p = new Produtos();
		p.setCodigo(7L);
		p.setDesricao("TV Samsung");
		p.setPreco(1800.00);
		p.setQuantidade(15L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(12L);
		p.setFabricante(f);
		
		ProdutoDAO pdao = new ProdutoDAO();
		pdao.editar(p);
		System.out.println("Atualizado com sucesso!");
		
	}
}
