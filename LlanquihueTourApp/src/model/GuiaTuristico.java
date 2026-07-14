package model;
public class GuiaTuristico extends Persona implements Registrable {
    private String especialidad;
    private int aniosExperiencia;
    public GuiaTuristico(String rut,
                         String nombre,
                         String telefono,
                         Direccion direccion,
                         String especialidad,
                         int aniosExperiencia){
        super(rut,nombre,telefono,direccion);
        this.especialidad=especialidad;
        this.aniosExperiencia=aniosExperiencia;}
    public String mostrarResumen(){
        return "Guía: "+getNombre()+" | Especialidad: "+especialidad+" | Experiencia: "+aniosExperiencia+" años";}
    public String getEspecialidad(){
        return especialidad;} public int getAniosExperiencia(){return aniosExperiencia;}
    public String toString(){
        return mostrarResumen();}
}
