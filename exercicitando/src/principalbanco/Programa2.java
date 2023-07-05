package principalbanco;

import java.util.HashMap;
import java.util.Map;

import entidades.Agencias;
import entidades.Banco;
import entidades.Conta;
import entidades.ContaJuridica;
import entidades.StatusConta;

public class Programa2 {

    public static void main(String[] args){
    
        Conta cliente1 = new ContaJuridica("suzane pereira carvalho", 6985, Agencias.MINASGERAIS,1500,160000,StatusConta.ATIVA);

        ContaJuridica cliente2 = new ContaJuridica("Batista souza", 4500, Agencias.RIODEJANEIRO, 1000, 2500, StatusConta.ATIVA);

        System.out.println("========================================================================================");
        System.out.println("Cliente  : "+cliente1.getNome() + "\n  SALDO EM CONTA: "+cliente1.getSaldoConta());
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
        cliente1.depositar(5000);
        System.out.println("Cliente  : "+cliente1.getNome() + "\n  SALDO EM CONTA: "+cliente1.getSaldoConta());
        System.out.println("========================================================================================");
        cliente1.sacar(11985);
        System.out.println("Cliente  : "+cliente1.getNome() + "\n  SALDO EM CONTA: "+cliente1.getSaldoConta());
        System.out.println("========================================================================================");
        cliente1.depositar(1100);
        System.out.println("Cliente  : "+cliente1.getNome() + "\n  SALDO EM CONTA: "+cliente1.getSaldoConta());
        System.out.println("========================================================================================\n\n\n");

        System.out.println("=======MODIFICAÇÕES NA CONTA JURIDICA===========");
        System.out.println("========================================================================================");
        cliente1.depositar(1100);
        System.out.println("Cliente  : "+cliente2.getNome() + "\n  SALDO EM CONTA: "+cliente2.getSaldoConta());
        System.out.println("INFORMAÇÕES DA CONTA PARA QUE POSSA REALIZAR AS MODIFICAÇÕES: ");
        System.out.println("LIMITE DE SAQUE: "+cliente2.getLimitSaque()+"   LIMITE DE EMPRESTIMO: "+cliente2.getLimitEmprestimo());
        System.out.println("========================================================================================");
        cliente2.emprestimo(2000);
        System.out.println("Cliente  : "+cliente2.getNome() + "\n  SALDO EM CONTA: "+cliente2.getSaldoConta());
        System.out.println("========================================================================================");
        System.out.println("===REALIZANDO SAQUE===");

        cliente2.emprestimo(3000);  // EMPRESTIMO NAO SERA ACEITO POIS ULTRAPASSA O LIMITE DE EMPRESTIMO DA CONTA
        cliente2.sacar(490);
        cliente2.sacar(100);
        System.out.println("Cliente  : "+cliente2.getNome() + "\n  SALDO EM CONTA: "+cliente2.getSaldoConta());
        System.out.println("========================================================================================");
        System.out.println("===REALIZANDO SAQUE===");

        cliente2.sacar(920);
        System.out.println("Cliente  : "+cliente2.getNome() + "\n  SALDO EM CONTA: "+cliente2.getSaldoConta());
    



        

        
}
    
}

