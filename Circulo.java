package org.example;

public class Circulo implements calcularFormas {

    private double radio;
    public Circulo () {
    }

    public Circulo (double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi + radio * radio;
    }
    @Override
    public double calcularPerimetro() {
        return pi * radio * 2;
    }
}
