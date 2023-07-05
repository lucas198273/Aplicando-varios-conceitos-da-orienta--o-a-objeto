package principalestoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programateste {
    
    public static void main(String[] args){
        Metodo1();

        System.out.println("Fim do programa");
    }

    public static void Metodo1(){
        System.out.println("****INICIO METODO 1 ****");
        Metodo2();
        System.out.println("****FIM METODO 1 ****");


    }


    public static void Metodo2(){

        System.out.println("****INICIO METODO 2 ****");
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("=================================================");
        System.out.println("INFORME OS NOMES A SEREM ADICIONADOS AO VETOR SEMPARADOS POR 1 ESPAÇO");
        String[] vect = sc.nextLine().split(" ");

        System.out.println("informe a posição que deseja consultar no vetor");
        int indice = sc.nextInt();
        System.out.println(vect[indice]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição invalida!");
        
        }
        catch(InputMismatchException e){
            System.out.println("VALOR INVALIDO");
        }
        System.out.println("****FIM METODO 2 ****");

    }
}
