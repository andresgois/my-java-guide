package Aula6;

public class Principal {

	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    }
		
	    /*Conexao con = null;
	    try {
	        con = new Conexao();
	        con.leDados();
	    } catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    } finally {
	    	 System.out.println("finally");
	         if(con != null) {
	             con.fecha();
	         }
	    }*/
	}
	
}
