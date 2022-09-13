/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Dron {
    private String id;
    private String marca;
    private double duracionBateria;

    public Dron(String id, String marca, double duracionBateria) {
        this.id = id;
        this.marca = marca;
        this.duracionBateria = duracionBateria;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the duracionBateria
     */
    public double getDuracionBateria() {
        return duracionBateria;
    }

    /**
     * @param duracionBateria the duracionBateria to set
     */
    public void setDuracionBateria(double duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
    
}
