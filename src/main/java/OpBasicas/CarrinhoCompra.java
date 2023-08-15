package main.java.OpBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Item> itemList;

    public CarrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.nome.equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
            itemList.removeAll(itensParaRemover);
            }

        }


    public double calcularValorTotal(){
    double valorTotal = 0;
        for (Item item : itemList){
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;


    }

    public void exibirItem(){
        for(Item item: itemList){
            System.out.println(this.itemList);
        }


    }

    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();
        carrinho.adicionarItem("notebook ", 2999.90, 1);
        carrinho.adicionarItem("celular ", 1999.90, 1);
        carrinho.adicionarItem("TV ", 3999.90, 1);
        carrinho.exibirItem();

        System.out.println("O valor total é: "+ carrinho.calcularValorTotal());

    }
}
