package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nombre;
    private double precio;
    private List<String> ingredientes;
    private List<String> toppings;
    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.toppings = new ArrayList<>();

    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping.getNombre());
    }

    public void preparacion() {

        System.out.println("Pizza "+nombre+ " esta lista para ser servida!");
    }

    public String toString(){
        return "\nNombre:"+getnombre()+"\nPrecio:"+getprecio()+"\nIngredientes:"+ingredientes+"\nToppings:"+toppings;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }



}
