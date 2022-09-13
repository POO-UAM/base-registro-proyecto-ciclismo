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
public class Confederacion {
    private String id;
    private String nombre;
    private ArrayList<Competencia> misCompetencias;
    private ArrayList<Ciclista> misCiclistas;
    public Confederacion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.misCiclistas=new ArrayList<>();
        this.misCompetencias=new ArrayList<>();
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the misCompetencias
     */
    public ArrayList<Competencia> getMisCompetencias() {
        return misCompetencias;
    }

    /**
     * @param misCompetencias the misCompetencias to set
     */
    public void setMisCompetencias(ArrayList<Competencia> misCompetencias) {
        this.misCompetencias = misCompetencias;
    }

    /**
     * @return the misCiclistas
     */
    public ArrayList<Ciclista> getMisCiclistas() {
        return misCiclistas;
    }

    /**
     * @param misCiclistas the misCiclistas to set
     */
    public void setMisCiclistas(ArrayList<Ciclista> misCiclistas) {
        this.misCiclistas = misCiclistas;
    }
    
}
