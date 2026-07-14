package model;
public class Vehiculo implements Registrable {
    private String patente,tipo;
    public Vehiculo(String patente,String tipo){
        this.patente=patente;this.tipo=tipo;}
    public String mostrarResumen(){
        return "Vehículo: "+patente+" | Tipo: "+tipo;}
    public String toString(){
        return mostrarResumen();}}
