/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author pipet
 */
public class Competencia {
    private String id;
    private String ubicacion;
    private ArrayList<Patrocinador> misPatrocinadores;
    private ArrayList<Prueba> misPruebas;
    private ArrayList<Inscripcion> misInscripciones;
    public Competencia(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.misPatrocinadores=new ArrayList<>();
        this.misPruebas=new ArrayList<>();
        this.misInscripciones=new ArrayList<>();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the misPatrocinadores
     */
    public ArrayList<Patrocinador> getMisPatrocinadores() {
        return misPatrocinadores;
    }

    /**
     * @param misPatrocinadores the misPatrocinadores to set
     */
    public void setMisPatrocinadores(ArrayList<Patrocinador> misPatrocinadores) {
        this.misPatrocinadores = misPatrocinadores;
    }

    /**
     * @return the misPruebas
     */
    public ArrayList<Prueba> getMisPruebas() {
        return misPruebas;
    }

    /**
     * @param misPruebas the misPruebas to set
     */
    public void setMisPruebas(ArrayList<Prueba> misPruebas) {
        this.misPruebas = misPruebas;
    }

    /**
     * @return the misInscripciones
     */
    public ArrayList<Inscripcion> getMisInscripciones() {
        return misInscripciones;
    }

    /**
     * @param misInscripciones the misInscripciones to set
     */
    public void setMisInscripciones(ArrayList<Inscripcion> misInscripciones) {
        this.misInscripciones = misInscripciones;
    }
    
}
