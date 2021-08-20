package br.com.farm.domain;

public class Produtos {

	private Long codigo;
	private String descricao;
	private Long quantidade;
	private Double preco;
	private Fornecedores fabricante = new Fornecedores();

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDesricao() {
		return descricao;
	}

	public void setDesricao(String desricao) {
		this.descricao = desricao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Fornecedores getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fornecedores fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return this.getDesricao() + " - R$ " + this.getPreco() + " - " + this.getQuantidade() + " - " + this.getFabricante();
	}
}
