package core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe che rappresenta un ristorante registrato
 * @author Cervini Samuele
 * @author Sarzi Sartori Andrea
 */
public class Ristorante implements Serializable {

    /**
     * Campo nome di tipo String
     */
    public String nome;

    /**
     * Campo tipologia di tipo String
     */
    public String tipologia;

    /**
     * Campo telefono di tipo String
     */
    public String telefono;

    /**
     * Campo sito di tipo String
     */
    public String sito;

    /**
     * Campo qualificatore di tipo String
     */
    public String qualificatore;

    /**
     * Campo indirizzo di tipo String
     */
    public String indirizzo;

    /**
     * Campo civico di tipo String
     */
    public String civico;

    /**
     * Campo comune di tipo String
     */
    public String comune;

    /**
     * Campo sigla di tipo String
     */
    public String sigla;

    /**
     * Campo cap di tipo int
     */
    public int cap;

    /**
     * Campo di tipo ArrayList che conterr&agrave; i giudizi legati al ristorante
     */
    public ArrayList<Giudizio> giudizi;

    /**
     * Metodo costruttore per istanziare un ristorante 
     * @param nome             Nome del ristorante
     * @param tipologia        Tipologia dei ristorante, a scelta fra Italiano, Etnico e Fusion
     * @param telefono         Numero di telefono del ristorante, massimo 15 caratteri compresi di prefisso internazionale
     * @param sito             URL del sito internet del ristorante, deve rispettare il form canonico degli URL
     * @param qualificatore    Scelta fra che tipo di identificatore prima dell'indirizzo si ha: Via, Viale, Corso, Piazza e Piazzale
     * @param indirizzo        Indirizzo del ristorante
     * @param civico           Numero civico del ristorante
     * @param comune           Comune di residenza del ristorante
     * @param sigla            Sigla del comune di residenza del ristorante, deve essere di 2 caratteri
     * @param cap              CAP di residenza del ristorante, deve essere almeno di 5 numeri
     */
    public Ristorante(String nome, String tipologia, String telefono, String sito, String qualificatore, String indirizzo, String civico, String comune, String sigla, int cap)  {
        this.nome = nome;
        this.tipologia = tipologia;
        this.telefono = telefono;
        this.sito = sito;
        this.qualificatore = qualificatore;
        this.indirizzo = indirizzo;
        this.civico = civico;
        this.comune = comune;
        this.sigla = sigla;
        this.cap = cap;
        this.giudizi = new ArrayList<>();
    }
    
    public String toString() {
        return "<html>" + nome + "<br/>" + tipologia + "<br/>" + telefono + "<br/>" +
                sito + "<br/>" + qualificatore + " " + indirizzo + " " +
                civico + "<br/>" + comune + " " + sigla + " " + cap + "</html>";
    }
}
