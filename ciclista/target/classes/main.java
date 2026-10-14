package com.uniajc;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Team Colombia", "Colombia");

        Velocista velocista = new Velocista(1, "Rigoberto", 450.5, 75.2);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(2, "Nairo", 2.8f, 12.5f);
        escalador.setTiempoAcumulado(115);

        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Egan", 65.0);
        contrarrelojista.setTiempoAcumulado(118);

        equipo1.anadirCiclista(velocista);
        equipo1.anadirCiclista(escalador);
        equipo1.anadirCiclista(contrarrelojista);

        equipo1.imprimirDatosEquipo();
        System.out.println();

        equipo1.listarNombresCiclistas();
        System.out.println();

        equipo1.imprimirDatosCiclistaPorId(2);

        equipo1.imprimirDatosCiclistaPorId(99);
    }
}