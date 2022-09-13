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
public class Prueba {
    private String id;
    private double puntaje;
    private double distancia;
    private int nivel;
    private ArrayList<Dron> misSensonres;
    private Dron miDron;

    public Prueba(String id, double puntaje, double distancia, int nivel) {
        this.id = id;
        this.puntaje = puntaje;
        this.distancia = distancia;
        this.nivel = nivel;
        this.misSensonres=new ArrayList<>();
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
     * @return the puntaje
     */
    public double getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the misSensonres
     */
    public ArrayList<Dron> getMisSensonres() {
        return misSensonres;
    }

    /**
     * @param misSensonres the misSensonres to set
     */
    public void setMisSensonres(ArrayList<Dron> misSensonres) {
        this.misSensonres = misSensonres;
    }

    /**
     * @return the miDron
     */
    public Dron getMiDron() {
        return miDron;
    }

    /**
     * @param miDron the miDron to set
     */
    public void setMiDron(Dron miDron) {
        this.miDron = miDron;
    }


    
}
