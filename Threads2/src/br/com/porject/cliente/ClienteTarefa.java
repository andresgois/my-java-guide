package br.com.porject.cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefa {

	public static void main(String[] args) throws IOException {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 12345);
			
			Scanner teclado = new Scanner(System.in);
			
			teclado.nextLine();
			
			System.out.println("Conexão estabelecida");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {			
			socket.close();
		}
		
	}

}
