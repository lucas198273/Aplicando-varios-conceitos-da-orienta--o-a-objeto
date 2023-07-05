package entidades;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entidadesproduto.Estoque;

public class Banco  {

    private static Map<Integer,Conta> BancoContas = new LinkedHashMap<>();



    public Banco() {
    }
    public void addConta(Integer id,Conta conta){
        if(BancoContas.containsKey(conta)){
            System.out.println("CONTA JA ESTA CADASTRADA");        // OK
        }
        else{
            BancoContas.put(id, conta);
        }
    }
    public void removeConta(Integer id ){                   // OK REMOÇÃO (PARAMETRO ID)
        if(BancoContas.containsKey(id)){                    // METODO DE REMOÇÃO NO MAP ESTA FUNCIONANDO
            BancoContas.remove(id);
        }
        else{
            System.out.println("CONTA NAO ENCONTRADA NO BANCO");
        }
    }
    public void exibirBancoContas(){
        for(Map.Entry<Integer,Conta> entry : BancoContas.entrySet()){
            int id =entry.getKey();
            Conta conta = entry.getValue();
            System.out.println("============================================================="+            // OK
            " \n  CONTA: "+id+ "      PORTADOR DA CONTA: "+conta.getNome()+" "+   "  SALDO EM CONTA: "+conta.saldoConta+
            "\n AGENCIA: "+conta.getAgencia()+" STATUS CONTA: "+conta.getStatusConta());
            System.out.println("=============================================================");
            
        }
    }
    public static Map<Integer,Conta> filtroStatus(Map<Integer,Conta> contas, StatusConta statusConta){
        
        return contas.entrySet().stream().filter(x -> x.getValue().getStatusConta() == statusConta).
                                                  collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        
    }
    
        
    
  
}

    


  

    

    

    
