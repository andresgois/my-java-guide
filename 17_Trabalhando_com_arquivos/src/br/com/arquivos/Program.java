package br.com.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        //getFileIn();
        
        //getFileReader();
        
        refactorGetFileReader(); 
    }

    private static void refactorGetFileReader() {
        String path = "d:\\temp\\in.txt";
        
        try (BufferedReader bufferedRead = new BufferedReader(new FileReader(path))) {
           
            String line = bufferedRead.readLine();
            
            while (line != null) {
                System.out.println(line);
                line = bufferedRead.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
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
            System.out.println("Error: "+e.getMessage());
        } finally {
            try {
                if(bufferedRead != null) {
                    bufferedRead.close();
                }
                if(fileReader != null) {
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
            
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            
        } catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
