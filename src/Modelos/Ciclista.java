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
public class Ciclista {
    private String id;
    private String nombre;
    private int edad;
    private ArrayList<Bicicleta> misBicicletas;
    private ArrayList<Inscripcion> misInscripciones;
    public Ciclista(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.misBicicletas=new ArrayList<>();
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the misBicicletas
     */
    public ArrayList<Bicicleta> getMisBicicletas() {
        return misBicicletas;
    }

    /**
     * @param misBicicletas the misBicicletas to set
     */
    public void setMisBicicletas(ArrayList<Bicicleta> misBicicletas) {
        this.misBicicletas = misBicicletas;
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
