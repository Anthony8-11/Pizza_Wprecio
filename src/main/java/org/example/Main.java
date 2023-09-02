package org.example;


public class Main {
    public static void main (String[] args){


        Topping queso = new Topping("Queso", 3.99);
        Topping champinones = new Topping("Champiñones", 6.80);
        Topping pimiento = new Topping("Pimientos", 11.50);


        Pizza pizza = new Pizza("Italiana");
        pizza.agregarTopping(queso);
        pizza.agregarTopping(champinones);
        pizza.agregarTopping(pimiento);

        System.out.println("Ingredientes seleccionados:");
        System.out.println(queso);
        System.out.println(champinones);
        System.out.println(pimiento);

        System.out.println("\nDetalles de preparacion:");
        pizza.preparar();
        System.out.println(pizza);

    }
}