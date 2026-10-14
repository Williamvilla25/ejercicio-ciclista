package com.uniajc;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private double tiempoAcumulado; // en minutos, valor inicial cero

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0.0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    // Método abstracto obligatorio que retorna un String
    public abstract String imprimirTipo();

    // Imprimir datos del ciclista (invocado por las hijas)
    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado de carrera: " + tiempoAcumulado + " minutos");
    }
}
