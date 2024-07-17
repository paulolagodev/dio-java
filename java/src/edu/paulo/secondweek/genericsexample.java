package edu.paulo.secondweek;

import java.util.List;
import java.util.ArrayList;

public class genericsexample {
    public static void main(String[] args) {
        List <String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Numero 1");
        listaGenerics.add("Numero 2");

        for( String elemento: listaGenerics){
            System.out.println(elemento);
        }
    }
}
