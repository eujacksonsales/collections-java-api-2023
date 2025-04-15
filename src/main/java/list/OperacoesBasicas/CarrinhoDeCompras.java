package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinhoCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : carrinhoCompras){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("leite", 4.99, 2);
        carrinhoDeCompras.adicionarItem("ovo", 0.75, 20);
        carrinhoDeCompras.adicionarItem("detergente", 3.95, 3);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("leite");
        carrinhoDeCompras.exibirItens();
    }
}
