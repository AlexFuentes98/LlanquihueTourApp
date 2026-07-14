package util;

import model.*;
import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {
    public static ArrayList<GuiaTuristico> cargarGuias(String archivo) {
        ArrayList<GuiaTuristico> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                try {
                    String[] datos = linea.split(";");

                    Direccion direccion = new Direccion(
                            datos[3],
                            Integer.parseInt(datos[4]),
                            datos[5]);

                    GuiaTuristico guia = new GuiaTuristico(
                            datos[0], datos[1], datos[2],
                            direccion, datos[6],
                            Integer.parseInt(datos[7]));

                    lista.add(guia);
                } catch (Exception e) {
                    System.out.println("Error en línea: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
        return lista;
    }
}
