package br.com.farm.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	
	private static final String USUARIO = "andre";
	private static final String SENHA = "0516";
	private static final String URL = "jdbc:mysql://localhost:3306/sistema";
	
	
	public static Connection conectar() throws SQLException {
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		
		return conexao;
	}
	
	/*
	 * public static void main(String[] args) { try { Connection conexao =
	 * ConexaoFactory.conectar(); System.out.println("Conectado com sucesso!"); }
	 * catch (SQLException e) { // TODO Auto-generated catch block
	 * System.out.println("Conexão Falhou"); e.printStackTrace(); } }
	 */
	
}
