package core;

import java.io.Serializable;

/**
 * Classe che gestisce la creazione tramite i 3 valori base dei giudizi
 * @author Cervini Samuele
 * @author Sarzi Sartori Andrea
 */
public class Giudizio implements Serializable {

    /**
     * Campo voto di tipo int
     */
    public int voto;

    /**
     * Campo nickname di tipo String
     */
    public String nickname;

    /**
     * Campo testo di tipo String , sarebbe la parte testuale del giudizio
     */
    public String testo;
    
    /**
     * Metodo che istanzia il giudizio scritto da un cliente
     * @param voto       Voto asseggato da 1 a 5 
     * @param nickname   Nickname con la quale si è loggati
     * @param testo      Recensione scritta eventuale da aggiungere per integrare il voto
     */
    public Giudizio(int voto, String nickname, String testo) {
        this.voto = voto;
        this.nickname = nickname;
        this.testo = testo;
    }
    
    public String toString() {        
        return voto + "/5" + " : " + nickname + " - " + testo;
    }
}
