package model;
public class Persona implements Registrable {
  private String rut,nombre,telefono;
  private Direccion direccion;
  public Persona(String rut,
                 String nombre,
                 String telefono,
                 Direccion direccion) {
   this.rut=rut;this.nombre=nombre;this.telefono=telefono;this.direccion=direccion;}
  public String getNombre(){
   return nombre;}
  public String getRut(){
   return rut;}
  public String mostrarResumen(){
   return "Persona: "+nombre;}
  public String toString(){
   return mostrarResumen();}
}
