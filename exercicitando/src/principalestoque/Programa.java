package principalestoque;

import java.util.Map;

import entidadesproduto.Estoque;
import entidadesproduto.Produto;

public class Programa {
    
    public static void main(String[] args){
        
        Produto produto1 = new Produto("PLAYSTATION 5", 5.000);
        Produto produto2 = new Produto("PLAYSTATION 4", 3.500);
        Produto produto3 = new Produto("PLAYSTATION 3", 2.4000);
        Produto produto4 = new Produto("PLAYSTATION 2", 1.700);
        Produto produto5 = new Produto("PLAYSTATION 1", 10.000);

        System.out.println("Exibindo estoque");
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 10);
        estoque.adicionarProduto(produto3, 10);
        estoque.adicionarProduto(produto4, 10);
        estoque.adicionarProduto(produto5, 10);

        estoque.exibirEstoque();

        // FUNÇÃO ADICONAR EM ESTOQUE ESTA FUNCIONANDO 

        System.out.println("=========================================================");
        System.out.println("\n=====INCIANDO TESTE DE REMOÇÃO=====");
        System.out.println("REDUZINDO 5 UNIDADES EM CADA PRODUTO, RESTARA 5");

        // estoque.removerProduto(produto5, 5);
        // estoque.removerProduto(produto4, 5);
        // estoque.removerProduto(produto3,5);
        // estoque.removerProduto(produto2, 5);
        // estoque.removerProduto(produto1, 5);

        estoque.exibirEstoque();

        System.out.println("REDUZINDO AS 5 UNIDADESD RESTANTES \n O RESULTADO ESPERADO E QUE O SISTEMA REMOVA OS PRODUTOS DE DENTRO DO ESTOQUE");
        System.out.println("\n\n");
        //estoque.removerProduto(produto5, 5);
        //estoque.removerProduto(produto4, 5);
        //estoque.removerProduto(produto3,5);
        //estoque.removerProduto(produto2, 5);
        //estoque.removerProduto(produto1, 5);

        estoque.exibirEstoque();


         // FUNÇÃO REMOVER EM ESTOQUE ESTA FUNCIONANDO 
         System.out.println("=========================================================");
        System.out.println("\n=====INCIANDO TESTE DE VENDAS=====");
        System.out.println("VENDENDO 3 UNIDADES EM CADA PRODUTO, RESULTADO ESPERADO  2 ");        // OK

        estoque.realizarVenda(produto5, 3);
        estoque.realizarVenda(produto4, 3);
        estoque.realizarVenda(produto3, 3);

        estoque.exibirEstoque();

        // estoque.removerProduto(produto1, 5);
        // estoque.realizarVenda(produto5, 6);
        // estoque.realizarVenda(produto1, null);


        System.out.println("========TESTANTO METODO DE FILTRAGEM POR QUANTIDADE EM ESTOQUE========");


        estoque.exibirEstoqueMaiorQue(8);

      
    }
}
