package br.com.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        // getFileIn();
        // getFileReader();
        //refactorGetFileReader();
        //getBufferedWriter();
        //getFolders();
        getInfo();
    }
    
    // informações do caminho do arquivo
    public static void getInfo() {
        Scanner sc = new Scanner(System.in);
        // d:\temp\in.txt
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();
        
        File path = new File(caminho);
        
        System.out.println("getName: "+path.getName());
        System.out.println("getParent: "+path.getParent());
        System.out.println("getFreeSpace: "+path.getFreeSpace());
        System.out.println("getTotalSpace: "+path.getTotalSpace());
        System.out.println("getFreeSpace: "+path.getFreeSpace());
        System.out.println("getUsableSpace: "+path.getUsableSpace());
    }
    
    // lista pastas
    public static void getFolders() {
        Scanner sc = new Scanner(System.in);
        // d:\
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();
        
        File path = new File(caminho);
        // mostra todos os diretórios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS");
        for(File folder: folders) {
            System.out.println(folder);
        }
        
        // mostra todos os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES");
        for(File file: files) {
            System.out.println(file);
        }
        
        // cria pastas
        boolean sucess = new File(caminho+"\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: "+sucess);
        
        sc.close();
    }
    
    // cria e escreve no arquivo
    public static void getBufferedWriter() {
        String path = "d:\\temp\\out.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String[] lines = new String[] {"Linha 1", "Linha 2", "Linha 3", "Teste"};
            
            for(String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void refactorGetFileReader() {
        String path = "d:\\temp\\in.txt";
        
        try (BufferedReader bufferedRead = new BufferedReader(
                new FileReader(path))) {
            String line = bufferedRead.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedRead.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void getFileReader() {
        String path = "d:\\temp\\in.txt";
        FileReader fileReader = null;
        BufferedReader bufferedRead = null;
        
        try {
            fileReader = new FileReader(path);
            bufferedRead = new BufferedReader(fileReader);
            
            String line = bufferedRead.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedRead.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bufferedRead != null) {
                    bufferedRead.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private static void getFileIn() {
        File file = new File("d:\\temp\\in.txt");
        Scanner sc = null;
        
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
