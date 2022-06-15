/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettolettorevideo;

/**
 *
 * @author fabiano
 */
public class ProjettoLettoreVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Esempio semplificato di applicazione orientata agli oggetti in Java 11+
        Video v[];
        v = new Video[3];
        v[0] = new Video("Analisi delle equazioni differenziali");
        v[1] = new Video("Analisi dell'algebra lineare");
        v[2] = new Video("Perché la programmazione funzionale è importante");
        
        ScienziatoDeiDati s[];
        s = new ScienziatoDeiDati[2];
        s[0] = new ScienziatoDeiDati("Fabiano", 22, "M",10,"Baltezan",5f);
        s[1] = new ScienziatoDeiDati("Davide", 30, "M",12,"Baltezan",4f);
        
        System.out.println(v[1].toString());
        System.out.println(s[0].toString());
        
    }
    
}
