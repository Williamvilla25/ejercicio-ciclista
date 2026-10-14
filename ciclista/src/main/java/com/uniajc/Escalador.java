package com.uniajc;

public class Escalador extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioAscenso;

    public Escalador(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioAscenso) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioAscenso = velocidadPromedioAscenso;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioAscenso() {
        return velocidadPromedioAscenso;
    }

    public void setVelocidadPromedioAscenso(double velocidadPromedioAscenso) {
        this.velocidadPromedioAscenso = velocidadPromedioAscenso;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio Ascenso: " + velocidadPromedioAscenso);
    }

}
