package principalreservadequartos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidadereserva.Reserva;

public class Principal {

    public static void main(String[] args)throws ParseException{

    try{
        System.out.println("Cadastro reserva cliente ".toUpperCase());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMERO DO QUARTO: ");
        int numeroQuarto = sc.nextInt();
        System.out.println("DATA DE ENTRADA: ");
        Date dataEntrada = sdf.parse(sc.next());
        System.out.println("DATA SAIDA: ");
        Date dataSaida = sdf.parse(sc.next());
    
        Reserva reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
        System.out.println("====RESERVA REALIZADA COM SUCESSO====");
        System.out.println(reserva);

        System.out.println("Atualize as datas".toUpperCase());
        System.out.println("DATA DE ENTRADA: ");
        dataEntrada = sdf.parse(sc.next());
        System.out.println("DATA SAIDA: ");
        dataSaida = sdf.parse(sc.next());

        reserva.atualizaData(dataEntrada, dataSaida);
        System.out.println("Reserva: "+reserva);
    
        sc.close();
    }
    catch(ParseException e){
    System.out.println("formato de data invalido");
    
    }
    catch(IllegalArgumentException e){
        System.out.println("ERRO: "+ e.getMessage());

    }
   
    }
}
