package br.com.porject.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefa {

	public static void main(String[] args) throws IOException, InterruptedException {

		//System.out.println("Threads Normal");
		//ThredNormal();
		
		// Aceita 2 e bloqueia o resto
		//System.out.println("Numero de threads fixa");
		//LimitandoNumeroDeThreds();
		
		// Número dinâmico de threads
		//NumeroDinameicoDeThreds();
		
		
		// Dando resposta ao cliente
		DevolvendoRespostaAoCliente();
		
	}

	private static void ThredNormal() throws IOException {
		System.out.println("---- Iniciado o servidor  ThredNormal-----");
		
		ServerSocket servidor = new ServerSocket(12345);
		
		while (true) {
			Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            new Thread(distribuirTarefas).start();
		}
	}
	
	private static void LimitandoNumeroDeThreds() throws IOException {
		System.out.println("---- Iniciado o servidor LimitandoNumeroDeThreds-----");
		ServerSocket servidor = new ServerSocket(12345);
		
		// limitando o número de threads | Pool de threads
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
	
		while (true) {
			Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            threadPool.execute(distribuirTarefas);
		}
	}

	private static void NumeroDinameicoDeThreds() throws IOException {
		System.out.println("---- Iniciado o servidor LimitandoNumeroDeThreds-----");
		ServerSocket servidor = new ServerSocket(12345);
		
		ExecutorService threadPool = Executors.newCachedThreadPool();
	
		while (true) {
			Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            threadPool.execute(distribuirTarefas);
		}
	}

	private static void DevolvendoRespostaAoCliente() throws IOException {
		System.out.println("---- Iniciado o servidor LimitandoNumeroDeThreds-----");
		ServerSocket servidor = new ServerSocket(12345);
		
		ExecutorService threadPool = Executors.newCachedThreadPool();
	
		while (true) {
			Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefasComRetornoAoCliente distribuirTarefas = new DistribuirTarefasComRetornoAoCliente(socket);
            threadPool.execute(distribuirTarefas);
		}
	}
}
