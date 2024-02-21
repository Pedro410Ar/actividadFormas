package org.example;

public class Rectangulo implements calcularFormas {
    public double base;
    public double altura;
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}
