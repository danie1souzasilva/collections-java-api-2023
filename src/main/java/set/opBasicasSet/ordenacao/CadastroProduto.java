package main.java.set.opBasicasSet.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();

    }
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> ExibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProdutos = new CadastroProduto();
        cadastroProdutos.adicionarProduto(0000, "café ",15.50, 2 );
        cadastroProdutos.adicionarProduto(0001, "açucar ",5.50, 1 );
        cadastroProdutos.adicionarProduto(0002, "leite ",4.50, 5 );

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.ExibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
