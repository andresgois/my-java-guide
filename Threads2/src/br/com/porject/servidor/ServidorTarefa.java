package br.com.porject.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTarefa {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("---- Iniciado o servidor -----");
		
		ServerSocket servidor = new ServerSocket(12345);
		
		while (true) {
			Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            new Thread(distribuirTarefas).start();
		}
	}

}
