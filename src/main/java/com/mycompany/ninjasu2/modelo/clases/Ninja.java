package com.mycompany.ninjasu2.modelo.clases;

import java.util.ArrayList;
import java.util.List;

public class Ninja {
    private int id; 
    private String nombre; 
    private Rango rango; 
    private Aldea aldea; 
    private List<Habilidad> habilidades; 
    private List<AsignacionMision> misiones; 

    public Ninja(int id, String nombre, Rango rango, Aldea aldea, List<Habilidad> habilidades, List<AsignacionMision> misiones) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
        this.habilidades = new ArrayList<>();
        this.misiones = new ArrayList<>();
    }
    
    
}
