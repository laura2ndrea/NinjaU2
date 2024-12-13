
package com.mycompany.ninjasu2.modelo.clases;

public class AsignacionMision {
    private int id; 
    private String fechaInicio; 
    private String fechafinal; 
    private boolean estado; 
    private Mision mision; 

    public AsignacionMision(int id, String fechaInicio, String fechafinal, boolean estado, Mision mision) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechafinal = fechafinal;
        this.estado = estado;
        this.mision = mision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }
    
    
}
