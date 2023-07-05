package principalbanco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Agencias;
import entidades.Banco;
import entidades.Conta;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;
import entidades.StatusConta;

public class Programa {
    
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        Map<Integer, Conta> clientes = new HashMap<>();

        
        Conta cliente1 = new ContaPoupanca("suzane pereira carvalho", 6985, Agencias.MINASGERAIS,0.4,StatusConta.ATIVA);

        Conta cliente2 = new ContaPoupanca("Paulo  Dias freitas", 6985, Agencias.MINASGERAIS,0.5,StatusConta.ATIVA);
        
        Conta cliente3 = new ContaPoupanca("Pedro pereira Dias", 6985, Agencias.MINASGERAIS,0.5,StatusConta.ATIVA);

        Conta cliente4 = new ContaPoupanca("Antonio de Carvalho", 4500, Agencias.SAOPAULO,0.4,StatusConta.DESATIVADA);
        
        Conta cliente5 = new ContaPoupanca("Antonia de souza", 0, Agencias.RIODEJANEIRO,0.5, StatusConta.DESATIVADA);

        Conta cliente6 = new ContaPoupanca("Pedro Leolpoldo", 0, Agencias.MINASGERAIS,0.5,StatusConta.DESATIVADA);

        ContaJuridica cliente7 = new ContaJuridica("Batista souza", 45.000, Agencias.RIODEJANEIRO, 5000, 10.000, StatusConta.ATIVA);

        
        clientes.put(1, cliente1);
        clientes.put(2, cliente2);
        clientes.put(3, cliente3);
        clientes.put(4, cliente4);
        clientes.put(5, cliente5);
        clientes.put(6, cliente6);
        clientes.put(7, cliente7);


       
        System.out.println("===================================================================================");
        System.out.println("==========CONTAS ATIVAS============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entry : clientes.entrySet()){
            int id = entry.getKey();
            Conta conta = entry.getValue();
            
            if(conta.getStatusConta().equals(StatusConta.ATIVA)){
            System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta());
            System.out.println("===================================================================================");
            }
        }
        System.out.println("===================================================================================");
        System.out.println("==========CONTAS DESATIVADAS============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entryMap : clientes.entrySet()) {
            int id = entryMap.getKey();
            Conta conta = entryMap.getValue();
            if(conta.getStatusConta().equals(StatusConta.DESATIVADA)){
            System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta());
            System.out.println("===================================================================================");

            }            
        }
        System.out.println("===================================================================================");
        System.out.println("==========CONTAS MINAS GERAIS============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entryMap : clientes.entrySet()) {
            int id = entryMap.getKey();
            Conta conta = entryMap.getValue();
            if(conta.getAgencia().equals(Agencias.MINASGERAIS)){
                System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+"||    AGENCIA:  "+conta.getAgencia());
            System.out.println("===================================================================================");

            }            
        }
        System.out.println("===================================================================================");
        System.out.println("==========CONTAS SÃO PAULO============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entryMap : clientes.entrySet()) {
            int id = entryMap.getKey();
            Conta conta = entryMap.getValue();
            if(conta.getAgencia().equals(Agencias.SAOPAULO)){
                System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+"||    AGENCIA:  "+conta.getAgencia());
            System.out.println("===================================================================================");

            }            
        }
        System.out.println("===================================================================================");
        System.out.println("==========CONTAS RIO DE JANEIRO============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entryMap : clientes.entrySet()) {
            int id = entryMap.getKey();
            Conta conta = entryMap.getValue();
            if(conta.getAgencia().equals(Agencias.RIODEJANEIRO)){
                System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+"||    AGENCIA:  "+conta.getAgencia());
            System.out.println("===================================================================================");

            }            
        }
        System.out.println("===================================================================================");
        System.out.println("==========TIPO DAS CONTAS============");
        System.out.println("===================================================================================");
        for (Map.Entry<Integer,Conta> entryMap : clientes.entrySet()) {
            int id = entryMap.getKey();
            Conta conta = entryMap.getValue();
            
            System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+
                             "|| \n  AGENCIA:  "+conta.getAgencia()+"  Tipo: "+conta.getClass());
            System.out.println("===================================================================================");

                      
        }
        System.out.println("\n\n======================TESTANTO METODO DE ADICIONAR E EXIBIR CONTAS QUE FORAM GUARDADAS EM LISTA DE CONTAS NO BANCO================");
        Banco banco = new Banco();


        banco.addConta(1, cliente1);
        banco.addConta(2, cliente2);       // OK
        banco.addConta(3, cliente3);          // EXIBIÇÃO E ADIÇÃO
        banco.addConta(4, cliente4);
        banco.addConta(5, cliente5);
        banco.addConta(6, cliente6);
        banco.addConta(7, cliente7);


        banco.exibirBancoContas();
        System.out.println("\n\n======================TESTANTO METODO DE REMOÇÃO      ok ================");
        // banco.removeConta(1);
        // banco.removeConta(2);
        
        banco.exibirBancoContas();


        System.out.println("==== TESTANDO METODO DE FILTRAGEM LAMBDA====");


        System.out.println("\n\n============CONTAS ATIVADAS===========");
        Map<Integer,Conta> listFiltaradaAtivas =  clientes.entrySet().stream().filter(x -> x.getValue().  // filtrando por enum com lambda
                    getStatusConta()== StatusConta.ATIVA). collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        for (Map.Entry<Integer,Conta> entry : listFiltaradaAtivas.entrySet()) {
            int id = entry.getKey();
            Conta conta = entry.getValue();
            
            System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+
                             "|| \n  AGENCIA:  "+conta.getAgencia()+"Status Conta: "+conta.getStatusConta()+"\n  Tipo: "+conta.getClass());
            System.out.println("===================================================================================");

        }

        System.out.println("\n\n============CONTAS DESATIVADAS===========");
        Map<Integer,Conta> listFiltaradaDesativadas =  clientes.entrySet().stream().filter(x -> x.getValue().  // filtrando por enum com lambda
        getStatusConta()== StatusConta.DESATIVADA). collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        for (Map.Entry<Integer,Conta> entry : listFiltaradaDesativadas.entrySet()) {
            int id = entry.getKey();
            Conta conta = entry.getValue();

            System.out.println("===================================================================================");
            System.out.println("#"+id +"   \n Conta: "+conta.getNome()+"|    SALDO ATUAL: "+conta.getSaldoConta()+
                            "|| \n  AGENCIA:  "+conta.getAgencia()+"Status Conta: "+conta.getStatusConta()+"\n  Tipo: "+conta.getClass());
            System.out.println("===================================================================================");

            }


         System.out.println( "CONTA POUPANÇA \n -7 DESCONTO DE SAQUE : Cliente 1: "+cliente1.getSaldoConta());
         System.out.println( "CONTA JURIDICA \n -10 DESCONTO DE SAQUE: Cliente 7: "+cliente7.getSaldoConta());

         cliente1.sacar(3);
         cliente7.sacar(10);

         System.out.println( "CONTA POUPANÇA \n -7 DESCONTO DE SAQUE : Cliente 1: "+cliente1.getSaldoConta());
         System.out.println( "CONTA JURIDICA \n -10 DESCONTO DE SAQUE: Cliente 7: "+cliente7.getSaldoConta());
         
         sc.close();
        
        
    }
        
}



