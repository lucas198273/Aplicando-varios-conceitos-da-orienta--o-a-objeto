package entidadesproduto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Estoque {
    
    private Map<Produto,Integer> estoque = new LinkedHashMap<>();

    public void adicionarProduto(Produto produto, Integer quantidade){
        if(estoque.containsKey(produto)){
            int quantidadeAtual = estoque.get(produto);                             // OK
            estoque.put(produto, quantidadeAtual+ quantidade);
        }
        else {
            estoque.put(produto, quantidade);
        }

    }
    public void removerProduto(Produto produto, Integer quantidade){
        if(estoque.containsKey(produto)){
            int quantidadeAtual = estoque.get(produto);
            if(quantidade >= quantidadeAtual){                                          //OK
                estoque.remove(produto);
            }
            else{
                estoque.put(produto, quantidadeAtual - quantidade);
            }
        }
        else {System.out.println("Produto nao encontrado no estoque");
        }
    }
    public void realizarVenda(Produto produto, Integer quantidade){
        if(estoque.containsKey(produto)){
            int quantidadeAtual = estoque.get(produto);
            if(quantidade < quantidadeAtual){
                estoque.put(produto, quantidadeAtual - quantidade);
            }
            else{
                System.out.println("QUANTIDADE INSUFICIENTE NO ESTOQUE" );
            }
        }
        else {System.out.println("PRODUTO NAO ENCONTRADO");
        }
    }
    public void exibirEstoque(){
        for (Map.Entry<Produto,Integer> entry: estoque.entrySet()) {
            Produto produto = entry.getKey();
            Integer quantidadeAtual = entry.getValue();
            System.out.println("============================================================="+   // OK
                            " \n  Produto: "+produto.getNome()+" "+   "  Preço: "+produto.getValor()+
                            "\n QUANTIDADE EM ESTOQUE: "+quantidadeAtual);
            System.out.println("=============================================================");

        }
    }                                                  // GetKey == Produto produto
    public void exibirEstoqueMaiorQue(int quantidade){ // GetValue == int quantidadeEmEstoque
        estoque.entrySet().stream().filter(x -> x.getValue() >= quantidade).forEach( x -> System.out.println( "Produto: "+x.getKey().getNome()+
                                                         " \n QUANTIDADE EM ESTOQUE: "+x.getValue()));           
    }

    public void exibirEstoqueMenorQue(int quantidade){
        estoque.entrySet().stream().filter(c -> c.getValue() <= quantidade).forEach(c -> System.out.println("Produto: "+c.getKey().getNome()+
                          " \n QUANTIDADE EM ESTOQUE: "+c.getValue()));   
    }

    
}