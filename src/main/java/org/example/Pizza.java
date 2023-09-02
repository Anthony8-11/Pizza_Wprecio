package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String nombre;
    private List<Topping> toppings;

    public Pizza(String nombre) {
        this.nombre = nombre;
        this.toppings = new ArrayList<>();
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (Topping topping : toppings) {
            precioTotal += topping.getPrecio();
        }
        return precioTotal;
    }

    public void preparar() {
        System.out.println("Preparando la pizza " + nombre + "...");
        System.out.println("Agregando chunches...");
        for (Topping topping : toppings) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Agregando " +topping.getNombre()+"...");
        }
    }
    @Override
    public String toString(){
        return "\nNombre:"+getnombre()+"\nPrecio a pagar: " + calcularPrecio() +"\nToppings:"+toppings;
    }

    public String getnombre() {
        return nombre;
    }
}
