package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> novosNumeros = new ArrayList<>(this.numeros);
        if(!novosNumeros.isEmpty()){
            Collections.sort(novosNumeros);
            return novosNumeros;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> novosNumeros = new ArrayList<>(this.numeros);
        if(!novosNumeros.isEmpty()){
            novosNumeros.sort(Collections.reverseOrder());
            return novosNumeros;
        }else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
        listaNumeros.adicionarNumero(11);
        listaNumeros.adicionarNumero(15);
        listaNumeros.adicionarNumero(121);

        System.out.println(listaNumeros.ordenarAscendente());
        System.out.println(listaNumeros.ordenarDescendente());

    }
}


