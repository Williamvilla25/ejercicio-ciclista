package com.uniajc;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void anadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        calcularTotalTiempos();
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo);
    }

    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre() + " (" + c.imprimirTipo() + ")");
        }
    }

    public void imprimirDatosCiclistaPorId(int identificador) {
        boolean encontrado = false;
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == identificador) {
                System.out.println("\n--- Datos del Ciclista ---");
                System.out.println(c.imprimirTipo());
                c.imprimirDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún ciclista con el identificador " + identificador);
        }
    }

    private void calcularTotalTiempos() {
        int suma = 0;
        for (Ciclista c : ciclistas) {
            suma += c.getTiempoAcumulado();
        }
        tiempoTotalEquipo = suma;
    }
}