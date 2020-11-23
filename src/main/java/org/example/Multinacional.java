package org.example;

import java.util.ArrayList;

public class Multinacional {
    public String nombre;
    public String ceo;
    public int ingresoTotal;
    public int gastoTotal;
    public ArrayList<Inversionista> inversores;
    public ArrayList<Sede> sedes;
    public int NIT;
    public int codigo;


    public Multinacional(String nombre, String ceo, int ingresoTotal, int gastoTotal, int NIT) {
        this.nombre = nombre ;
        this.NIT = NIT;
        this.ceo = ceo;
        this.ingresoTotal = ingresoTotal;
        this.gastoTotal = gastoTotal;
        this.inversores=new ArrayList<>();
        this.sedes=new ArrayList<>();

    }


    @Override
    public String toString(){
        return "Nombre: "+nombre+", ceo: "+ceo+", NIT: "+NIT+", numero de sedes: "+sedes.size()+", fondos: "+ingresoTotal+", gastos: "+gastoTotal;
    }


}