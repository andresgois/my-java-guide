package Aula01;

public class Fluxo2 {

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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0;
        	Conta c = null;
        	c.depositar();
        }
        System.out.println("Fim do metodo2");        
    }
}