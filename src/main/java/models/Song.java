package models;

public class Song {

    private int anno;
    private String autore;
    private String titolo;
    private String album;

    public Song(int anno, String autore, String titolo, String album) {
        
        this.anno = anno;
        this.autore = autore;
        this.titolo = titolo;
        this.album = album;
    }
    
    public Song() { }

    /**
     * @return anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @return autore
     */
    public String getAuthor() {
        return autore;
    }

    /**
     * @return titolo
     */
    public String getTitle() {
        return titolo;
    }

    /**
     * @return album
     */
    public String getAlbum() {
        return album;
    }
    
    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public void setAuthor(String autore) {
        this.autore = autore;
    }

    public void setTitle(String titolo) {
        this.titolo =  titolo;
    }
    
}