package br.com.porject.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefa {

	public static void main(String[] args) throws IOException {
		Socket socket = null;
		PrintStream saida = null;
		Scanner teclado = null;
		
		try {
			socket = new Socket("localhost", 12345);
			System.out.println("Conexão estabelecida");
			
			saida = new PrintStream(socket.getOutputStream());
			saida.println("c1");
			
			teclado = new Scanner(System.in);
			teclado.nextLine();
			
			saida.close();
			teclado.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
