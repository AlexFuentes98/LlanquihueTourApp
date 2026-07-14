package model;

public class ColaboradorExterno extends Persona implements Registrable {
    private String empresa;
    public ColaboradorExterno(
            String r,
            String n,
            String t,
            Direccion d,
            String e){super(r,n,t,d);empresa=e;}
    public String mostrarResumen(){return "Colaborador: "+getNombre()+" | Empresa: "+empresa;} }
