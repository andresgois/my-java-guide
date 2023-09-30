package Aula01;

public class Fluxo3 {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.err.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
      	metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //ArithmeticException ex = new ArithmeticException("Deu ruim");        
        //throw ex;
        
        throw new ArithmeticException("Deu ruim");
        //System.out.println("Fim do metodo2");        
    }
}