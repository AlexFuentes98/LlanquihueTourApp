package data;

import java.util.*; import model.*;

public class GestorEntidades {
    private ArrayList<Registrable> lista=new ArrayList<>();
    public void agregar(Registrable r){lista.add(r);}
    public String mostrar(){String s="";
        for(Registrable r:lista){
            if(r instanceof GuiaTuristico)s+="GUIA -> ";
            else if(r instanceof Vehiculo)s+="VEHICULO -> ";
            else if(r instanceof ColaboradorExterno)s+="COLABORADOR -> "; s+=r.mostrarResumen()+"\n";}
        return s;} }
