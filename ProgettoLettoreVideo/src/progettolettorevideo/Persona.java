/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettolettorevideo;

/**
 *
 * @author fabiano
 */
public abstract class Persona {
    protected String nome;
    protected int eta;
    protected String sesso;
    protected float esperienza;

    public Persona(String nome, int eta, String sesso, float esperienza) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.esperienza = 0;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", eta=" + eta + ", sesso=" + sesso + ", esperienza=" + esperienza + '}';
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public float getEsperienza() {
        return esperienza;
    }

    public void setEsperienza(float esperienza) {
        this.esperienza = esperienza;
    }
    
}
