package br.com.farm.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.farm.DAO.FornecedoresDAO;
import br.com.farm.DAO.ProdutoDAO;
import br.com.farm.domain.Fornecedores;
import br.com.farm.domain.Produtos;
import br.com.farm.util.JSFUtil;

@ManagedBean(name = "MBProdutos")
@ViewScoped
public class ProdutosBean {

	private Produtos produtos;
	private ArrayList<Produtos> itens;
	private ArrayList<Produtos> itensFiltrados;
	private ArrayList<Fornecedores> comboForncedores;
	
	public ArrayList<Fornecedores> getComboForncedores() {
		return comboForncedores;
	}
	
	public void setComboForncedores(ArrayList<Fornecedores> comboForncedores) {
		this.comboForncedores = comboForncedores;
	}
	
	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}



	public ArrayList<Produtos> getItens() {
		return itens;
	}



	public void setItens(ArrayList<Produtos> itens) {
		this.itens = itens;
	}



	public ArrayList<Produtos> getItensFiltrados() {
		return itensFiltrados;
	}



	public void setItensFiltrados(ArrayList<Produtos> itensFiltrados) {
		this.itensFiltrados = itensFiltrados;
	}



	/***
	 * Ao iniciar o projeto, ele executa esse método
	 */
	@PostConstruct
	public void prepararPesquisa() {
		try {
			ProdutoDAO pdao = new ProdutoDAO();
			itens = pdao.listar();

		} catch (SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}
	
	public void preparaNovo() {
		try {
			produtos = new Produtos();
			FornecedoresDAO dao = new FornecedoresDAO();
			comboForncedores = dao.listar();
		}catch(SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}
	
	public void preparaEditar() {
		try {
			produtos = new Produtos();
			FornecedoresDAO dao = new FornecedoresDAO();
			comboForncedores = dao.listar();
		}catch(SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}
	
	public void novo() {
		try {
			ProdutoDAO fdao = new ProdutoDAO();
			fdao.salvar(produtos);

			itens = fdao.listar();

			JSFUtil.adicionarMensagemSucesso("Produto salvo com sucesso");

		} catch (SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			System.out.println("Erro a salvar produto");
			e.printStackTrace();
		}
	}
	
	public void excluir() {
		try {
			ProdutoDAO fdao = new ProdutoDAO();
			fdao.excluir(produtos);
			itens = fdao.listar();
			JSFUtil.adicionarMensagemSucesso("produto deletado com sucesso");

		} catch (SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}


	public void editar() {
		try {
			ProdutoDAO fdao = new ProdutoDAO();
			fdao.editar(produtos);
			itens = fdao.listar();
			JSFUtil.adicionarMensagemSucesso("produto editado com sucesso");

		} catch (SQLException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}


	
	
	
}
