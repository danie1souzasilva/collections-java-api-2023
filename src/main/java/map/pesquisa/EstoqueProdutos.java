package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }
    public void AdicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }


        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p: estoqueProdutoMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.AdicionarProduto(000, "TV", 1, 2999.90);
        estoque.AdicionarProduto(001, "celular", 10, 1999.90);
        estoque.exibirProduto();

        System.out.println("O valor do estoque :" + estoque.calcularValorTotalEstoque());
        System.out.println(" O produto mais barato é: " + estoque.obterProdutoMaisCaro());

    }


}
