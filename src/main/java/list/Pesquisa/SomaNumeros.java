package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public List<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }

    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int numero : listaDeNumeros){
            soma+= numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for(int numero : listaDeNumeros){
                if(numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }else {
            System.out.println("Lista vazia");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaDeNumeros.isEmpty()){
            for(int numero : listaDeNumeros){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }else{
            System.out.println("Lista vazia");
        }
        return menorNumero;
    }

    public String exibirNumeros(){
        return toString();
    }

    @Override
    public String toString() {
        return "SomaNumeros " + listaDeNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();
        listaNumeros.adicionarNumero(30);
        listaNumeros.adicionarNumero(45);
        listaNumeros.adicionarNumero(60);

        System.out.println(listaNumeros.calcularSoma());
        System.out.println(listaNumeros.encontrarMaiorNumero());
        System.out.println(listaNumeros.encontrarMenorNumero());
        System.out.println(listaNumeros.exibirNumeros());

    }
}
