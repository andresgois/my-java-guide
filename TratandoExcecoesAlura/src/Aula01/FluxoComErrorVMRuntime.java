package Aula01;

public class FluxoComErrorVMRuntime {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecaoException e) {
			System.err.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecaoException {
        System.out.println("Ini do metodo1");
      	metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecaoException {
    	System.out.println("Metodo2");
        throw new MinhaExcecaoException("Deu erro");
    }
}