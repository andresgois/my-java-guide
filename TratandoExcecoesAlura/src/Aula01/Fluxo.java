package Aula01;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
		} catch (ArithmeticException e) {
			System.err.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
        // Erro aqui
        /*
         * Ini do main
			Ini do metodo1
			Ini do metodo2
			1
			Fim do main
			Error: / by zero
         */
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        //try {
        	metodo2();
		/*} catch (ArithmeticException e) {
			System.err.println("Error: "+e.getMessage());
		}*/
        // Erro aqui
        /*
         * Ini do main
			Ini do metodo1
			Ini do metodo2
			1
			Fim do metodo1
			Error: / by zero
			Fim do main
         * */
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //try {
            	int a = i / 0;
			//} catch (ArithmeticException e) {
				//System.err.println("Error: "+e.getMessage());
			//}
           // Erro aqui
        	/*
        	 * 	Ini do main
				Ini do metodo1
				Ini do metodo2
				1
				Error: / by zero
				2
				Error: / by zero
				Error: / by zero
				3
				4
				Error: / by zero
				5
				Fim do metodo2
				Error: / by zero
				Fim do metodo1
				Fim do main
            */
        }
        System.out.println("Fim do metodo2");        
    }
}