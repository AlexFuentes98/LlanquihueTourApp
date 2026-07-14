package ui;
import javax.swing.*; import data.*; import model.*;
public class InterfazGrafica {
    public static void iniciar(){
        GestorEntidades g=new GestorEntidades();
        g.agregar(
                new GuiaTuristico("1","Ana","999",new Direccion("Centro",1,"Llanquihue"),"Cultura",5));
        g.agregar(
                new Vehiculo("ABC123","Van")); g.agregar(new ColaboradorExterno("2","Pedro","888",new Direccion("Sur",2,"Llanquihue"),"Hotel"));
                JOptionPane.showMessageDialog(null,g.mostrar()); }
}
