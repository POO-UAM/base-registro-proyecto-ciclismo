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
public class Inscripcion {
    private String idParticipante;
    private Competencia miCompetencia;
    private Ciclista miCiclista;
    public Inscripcion(String idParticipante) {
        this.idParticipante = idParticipante;
    }

    /**
     * @return the idParticipante
     */
    public String getIdParticipante() {
        return idParticipante;
    }

    /**
     * @param idParticipante the idParticipante to set
     */
    public void setIdParticipante(String idParticipante) {
        this.idParticipante = idParticipante;
    }

    /**
     * @return the miCompetencia
     */
    public Competencia getMiCompetencia() {
        return miCompetencia;
    }

    /**
     * @param miCompetencia the miCompetencia to set
     */
    public void setMiCompetencia(Competencia miCompetencia) {
        this.miCompetencia = miCompetencia;
    }

    /**
     * @return the miCiclista
     */
    public Ciclista getMiCiclista() {
        return miCiclista;
    }

    /**
     * @param miCiclista the miCiclista to set
     */
    public void setMiCiclista(Ciclista miCiclista) {
        this.miCiclista = miCiclista;
    }
    
}
