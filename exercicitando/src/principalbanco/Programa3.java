package principalbanco;

import java.util.ArrayList;
import java.util.List;

import entidades.Agencias;
import entidades.Conta;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;
import entidades.StatusConta;

public class Programa3 {

    public static void main(String[] args){

        List<Conta> listContas = new ArrayList<>();

        listContas.add( new ContaJuridica("ORLANDO", 1000, Agencias.MINASGERAIS, 500, 15000, StatusConta.ATIVA));
        listContas.add( new ContaPoupanca("JUNIOR", 1000, Agencias.MINASGERAIS, 0.5, StatusConta.ATIVA));
        listContas.add( new ContaPoupanca("PEDRO", 1000, Agencias.MINASGERAIS, 0.5, StatusConta.ATIVA));
        listContas.add( new ContaJuridica("FERNANDO", 1000, Agencias.MINASGERAIS, 500, 9000, StatusConta.ATIVA));
        listContas.add( new ContaJuridica("OTAVIO", 1000, Agencias.MINASGERAIS, 500, 5000, StatusConta.ATIVA));

        double sum = 0.0;
        for (Conta conta : listContas) {
            sum += conta.getSaldoConta();
        }
        System.out.println(sum);
        for (Conta conta : listContas) {
            System.out.println("======================================================");
            System.out.println(" "+conta.getNome()+"  Saldo em conta: "+conta.getSaldoConta());
            System.out.println("======================================================");
        }

        System.out.print("subtraindo 100 de todas as contas: ");
        for ( Conta conta : listContas) {
            conta.sacar(100);
        }
        for (Conta conta : listContas) {
            System.out.println("======================================================");
            System.out.println(" "+conta.getNome()+"  Saldo em conta: "+conta.getSaldoConta());
            System.out.println("======================================================");
        }
        System.out.print("Depositando 100 de todas as contas: ");
        for ( Conta conta : listContas) {
            conta.depositar(100);
        }
        for (Conta conta : listContas) {
            System.out.println("======================================================");
            System.out.println(" "+conta.getNome()+"  Saldo em conta: "+conta.getSaldoConta());
            System.out.println("======================================================");
        }



    }
    
}
