package service;

import model.GuiaTuristico;
import java.util.ArrayList;

public class GuiaService {
    private ArrayList<GuiaTuristico> guias;

    public GuiaService(ArrayList<GuiaTuristico> guias) {
        this.guias = guias;
    }

    public void mostrarGuias() {
        for (GuiaTuristico guia : guias) {
            System.out.println("\n----------------");
            System.out.println(guia);
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (GuiaTuristico guia : guias) {
            if (guia.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\nGUÍA ENCONTRADO");
                System.out.println(guia);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No existe el guía.");
    }

    public void buscarPorRut(String rut) {
        boolean encontrado = false;
        for (GuiaTuristico guia : guias) {
            if (guia.getRut().equalsIgnoreCase(rut)) {
                System.out.println("\nRUT ENCONTRADO");
                System.out.println(guia);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Rut no encontrado.");
    }

    public void mostrarGuiasExpertos() {
        System.out.println("\n=== GUÍAS CON MÁS DE 5 AÑOS ===");
        for (GuiaTuristico guia : guias) {
            if (guia.getAniosExperiencia() > 5) System.out.println(guia + "\n");
        }
    }

    public void totalGuias() {
        System.out.println("\nTotal de guías: " + guias.size());
    }

    public void estadisticas() {
        int suma = 0;
        for (GuiaTuristico guia : guias) suma += guia.getAniosExperiencia();
        double promedio = (double)suma / guias.size();
        System.out.println("\nPromedio de experiencia: " + promedio + " años");
    }
}

