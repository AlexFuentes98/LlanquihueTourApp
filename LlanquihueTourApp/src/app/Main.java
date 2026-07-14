package app;

import model.GuiaTuristico;
import service.GuiaService;
import util.ArchivoUtil;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { ui.InterfazGrafica.iniciar();
        

        ArrayList<GuiaTuristico> guias =
                ArchivoUtil.cargarGuias("src/data/guias.txt");

        GuiaService servicio = new GuiaService(guias);

        System.out.println("=== LISTA DE GUÍAS ===");
        servicio.mostrarGuias();

        servicio.buscarPorNombre("Juan Pérez");
        servicio.buscarPorRut("22.222.222-2");
        servicio.mostrarGuiasExpertos();
        servicio.totalGuias();
        servicio.estadisticas();
    }
}