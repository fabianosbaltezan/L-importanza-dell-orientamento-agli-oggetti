/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettolettorevideo;

/**
 *
 * @author fabiano
 */
public class Visualizzazione {
    private ScienziatoDeiDati ricercatore;
    private Video documentario;

    public Visualizzazione(ScienziatoDeiDati ricercatore, Video documentario) {
        this.ricercatore = ricercatore;
        this.documentario = documentario;
        this.ricercatore.setTotaleassistito(this.ricercatore.getTotaleassistito() + 1);
        this.documentario.setVisualizzazioni(this.documentario.getVisualizzazioni() + 1);
    }
    
    public void valutare(){
        this.documentario.setValutazione(5);
    }
    
    public void valutare(int nota) {
        this.documentario.setValutazione(nota);
    }
    
    public void valutare(float percentuale) {
        int tot  = 0;
        if (percentuale <= 20){
            tot = 3;
        } else if (percentuale <= 50){
            tot = 5;
        } else if (percentuale <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.documentario.setValutazione(tot);
    }

    public ScienziatoDeiDati getRicercatore() {
        return ricercatore;
    }

    public void setRicercatore(ScienziatoDeiDati ricercatore) {
        this.ricercatore = ricercatore;
    }

    public Video getDocumentario() {
        return documentario;
    }

    public void setDocumentario(Video documentario) {
        this.documentario = documentario;
    }

    @Override
    public String toString() {
        return "Visualizzazione{" + "ricercatore=" + ricercatore + ", documentario=" + documentario + '}';
    }
    
    
    
}
