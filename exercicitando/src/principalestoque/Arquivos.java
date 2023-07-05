package principalestoque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivos {

    public static void main(String[] args){

        File arquivo = new File("C: \\usuarioteste\\texto.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(arquivo);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }
        }
        catch(FileNotFoundException c){
            System.out.println("Arquivo nao encontrado"+c.getMessage());

        }
        finally{
            if(sc != null){
               
                sc.close();
            }
            System.out.println("BLOCO FINALLY EXECUTADO");
        }

    }
    
}
