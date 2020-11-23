package org.example;

import java.util.ArrayList;

public class Pais {
    public String nombre;
    public String presidente;
    public ArrayList<Sede> sedes;

    public Pais(String nombre,String presidente){
        this.nombre=nombre;
        this.presidente=presidente;
        this.sedes=new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", presidente: "+presidente+", numero de sedes: "+sedes.size();
    }

}