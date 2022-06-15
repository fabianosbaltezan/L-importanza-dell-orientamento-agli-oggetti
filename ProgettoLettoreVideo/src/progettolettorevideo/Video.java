/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettolettorevideo;

/**
 *
 * @author fabiano
 */
public class Video implements AzioniVideo {
    private String titolo;
    private int valutazione;
    private int visualizzazioni;
    private int piace;
    private boolean riproduzione;

    public Video(String titolo) {
        this.titolo = titolo;
        this.valutazione = 1;
        this.piace = 0;
        this.riproduzione = false;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        int nuovo;
        nuovo = (int) ((this.valutazione + valutazione)/this.visualizzazioni);
        this.valutazione = nuovo;
    }

    public int getVisualizzazioni() {
        return visualizzazioni;
    }

    public void setVisualizzazioni(int visualizzazioni) {
        this.visualizzazioni = visualizzazioni;
    }

    public int getPiace() {
        return piace;
    }

    public void setPiace(int piace) {
        this.piace = piace;
    }

    public boolean isRiproduzione() {
        return riproduzione;
    }

    public void setRiproduzione(boolean riproduzione) {
        this.riproduzione = riproduzione;
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    @Override
    public String toString() {
        return "Video{" + "titolo=" + titolo + ", valutazione=" + valutazione + ", visualizzazioni=" + visualizzazioni + ", piace=" + piace + ", riproduzione=" + riproduzione + '}';
    }
    
}

    
    
    
    