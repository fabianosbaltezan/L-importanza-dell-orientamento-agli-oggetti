/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettolettorevideo;

/**
 *
 * @author fabiano
 */
public class ScienziatoDeiDati extends Persona {
    private String login;
    private int totaleassistito;

    public ScienziatoDeiDati(String login, int totaleassistito, String nome, int eta, String sesso, float esperienza) {
        super(nome, eta, sesso, esperienza);
        this.login = login;
        this.totaleassistito = totaleassistito;
    }

    @Override
    public String toString() {
        return "ScienziatoDeiDati{" + super.toString() + "login=" + login + ", totaleassistito=" + totaleassistito + '}';
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotaleassistito() {
        return totaleassistito;
    }

    public void setTotaleassistito(int totaleassistito) {
        this.totaleassistito = totaleassistito;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getEta() {
        return eta;
    }

    @Override
    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String getSesso() {
        return sesso;
    }

    @Override
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    @Override
    public float getEsperienza() {
        return esperienza;
    }

    @Override
    public void setEsperienza(float esperienza) {
        this.esperienza = esperienza;
    }
    
}
