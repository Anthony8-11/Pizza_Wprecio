package org.example;

public class Topping {

    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.agregarTopping(this);
    }

}
