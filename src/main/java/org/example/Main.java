package org.example;

import java.util.Arrays;
public class Main {
    public static void main (String[] args){


        Topping quesoTopping = new Topping("Queso");
        Topping champinonesTopping = new Topping("Champiñones");

        Pizza pi = new Pizza("ZZZ", 000, Arrays.asList("Piña","Jamon","Queso"));
        quesoTopping.agregar(pi);
        champinonesTopping.agregar(pi);
        System.out.println(pi.toString());
        pi.preparacion();

        PizzaItaliana pila = new PizzaItaliana("Italiana", 150, Arrays.asList("Albahaca","Queso","Tomate"), "Tomate", 10);
        System.out.println(pila.toString());
        pila.preparacion();

    }
}