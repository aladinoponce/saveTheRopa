package main;

import clases.GuardaRopa;
import clases.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("marca1","modelo1"));
        prendas.add(new Prenda("marca2","modelo2"));
        List<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(new Prenda("marca3","modelo3"));
        prendas2.add(new Prenda("marca4","modelo4"));
        Integer gr = guardaRopa.guardarPrenda(prendas);
        Integer gr2 = guardaRopa.guardarPrenda(prendas2);
        guardaRopa.mostrarPrendas();
        guardaRopa.devolverPrenda(gr2).forEach(System.out::println);
    }
}
