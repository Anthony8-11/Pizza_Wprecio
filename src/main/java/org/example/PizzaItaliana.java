package org.example;

import java.util.List;

public class PizzaItaliana extends Pizza {

    private String salsa;
    private int timeHorno;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int timeHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.timeHorno = timeHorno;
    }

    @Override
    public void preparacion() {
        System.out.println("Pizza "+getnombre()+" con salsa de "+ salsa + " esta lista para ser servida!");
    }

    @Override
    public String toString() {
        return super.toString() + " \nSalsa: " + salsa + "\nTiempo en horno: " + timeHorno + " minutos";
    }
}



