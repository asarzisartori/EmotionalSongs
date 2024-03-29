package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import models.Song;

public class Utilities {
    
    //Credenziali final per l'accesso al DB
    private final String url = "jdbc:postgresql://localhost:8996/postgres";
    private final String user = "postgres";
    private final String password = "admin";
    
    //Permette la connessione al database
    public Connection connect() {
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connessione al database effettuata con successo.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection; 
    }
    
    public ArrayList<float[]> visualizzaEmozioneBrano(String idCanzone) {
        
        ArrayList<float[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs_potere = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Potere' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_potere.isBeforeFirst()) {
                float[] potere = {0};
                results.add(potere);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_potere.next()) {
                    count = rs_potere.getInt("total");
                }
                ResultSet rs_potere_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Potere' AND idCanzone = '" + idCanzone + "'");
                while (rs_potere_avg.next()) {
                    avg = rs_potere_avg.getFloat(1);
                }
                float[] potere = {count, avg};
                results.add(potere);
            }
            
            ResultSet rs_gioia = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Gioia' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_gioia.isBeforeFirst()) {
                float[] goia = {0};
                results.add(goia);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_gioia.next()) {
                    count = rs_gioia.getInt("total");
                }
                ResultSet rs_gioia_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Gioia' AND idCanzone = '" + idCanzone + "'");
                while (rs_gioia_avg.next()) {
                    avg = rs_gioia_avg.getFloat(1);
                }
                float[] goia = {count, avg};
                results.add(goia);
            }
            
            ResultSet rs_tensione = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Tensione' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_tensione.isBeforeFirst()) {
                float[] tensione = {0};
                results.add(tensione);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_tensione.next()) {
                    count = rs_tensione.getInt("total");
                }
                ResultSet rs_tensione_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Tensione' AND idCanzone = '" + idCanzone + "'");
                while (rs_tensione_avg.next()) {
                    avg = rs_tensione_avg.getFloat(1);
                }
                float[] tensione = {count, avg};
                results.add(tensione);
            }
            
            ResultSet rs_nostalgia = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Nostalgia' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_nostalgia.isBeforeFirst()) {
                float[] nostalgia = {0};
                results.add(nostalgia);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_nostalgia.next()) {
                    count = rs_nostalgia.getInt("total");
                }
                ResultSet rs_nostalgia_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Nostalgia' AND idCanzone = '" + idCanzone + "'");
                while (rs_nostalgia_avg.next()) {
                    avg = rs_nostalgia_avg.getFloat(1);
                }
                float[] nostalgia = {count, avg};
                results.add(nostalgia);
            }
            
            ResultSet rs_tristezza = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Tristezza' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_tristezza.isBeforeFirst()) {
                float[] tristezza = {0};
                results.add(tristezza);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_tristezza.next()) {
                    count = rs_tristezza.getInt("total");
                }
                ResultSet rs_tristezza_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Tristezza' AND idCanzone = '" + idCanzone + "'");
                while (rs_tristezza_avg.next()) {
                    avg = rs_tristezza_avg.getFloat(1);
                }
                float[] tristezza = {count, avg};
                results.add(tristezza);
            }
            
            ResultSet rs_stupore = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Stupore' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_stupore.isBeforeFirst()) {
                float[] stupore = {0};
                results.add(stupore);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_stupore.next()) {
                    count = rs_stupore.getInt("total");
                }
                ResultSet rs_stupore_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Stupore' AND idCanzone = '" + idCanzone + "'");
                while (rs_stupore_avg.next()) {
                    avg = rs_stupore_avg.getFloat(1);
                }
                float[] stupore = {count, avg};
                results.add(stupore);
            }
            
            ResultSet rs_solennita = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Solennità' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_solennita.isBeforeFirst()) {
                float[] solennita = {0};
                results.add(solennita);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_solennita.next()) {
                    count = rs_solennita.getInt("total");
                }
                ResultSet rs_solennita_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Solennità' AND idCanzone = '" + idCanzone + "'");
                while (rs_solennita_avg.next()) {
                    avg = rs_solennita_avg.getFloat(1);
                }
                float[] solennita = {count, avg};
                results.add(solennita);
            }
            
            ResultSet rs_tenerezza = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Tenerezza' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_tenerezza.isBeforeFirst()) {
                float[] tenerezza = {0};
                results.add(tenerezza);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_tenerezza.next()) {
                    count = rs_tenerezza.getInt("total");
                }
                ResultSet rs_tenerezza_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Tenerezza' AND idCanzone = '" + idCanzone + "'");
                while (rs_tenerezza_avg.next()) {
                    avg = rs_tenerezza_avg.getFloat(1);
                }
                float[] tenerezza = {count, avg};
                results.add(tenerezza);
            }
            
            ResultSet rs_calma = stmt.executeQuery("SELECT COUNT (*) AS total FROM public.emozioni WHERE nome = 'Calma' AND idcanzone = '" + idCanzone + "'");
            
            if (!rs_calma.isBeforeFirst()) {
                float[] calma = {0};
                results.add(calma);
            } else {
                float count = 0;
                float avg = 0;
                while (rs_calma.next()) {
                    count = rs_calma.getInt("total");
                }
                ResultSet rs_calma_avg = stmt.executeQuery("SELECT AVG(valutazione) FROM public.emozioni WHERE nome = 'Calma' AND idCanzone = '" + idCanzone + "'");
                while (rs_calma_avg.next()) {
                    avg = rs_calma_avg.getFloat(1);
                }
                float[] calma = {count, avg};
                results.add(calma);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
    public void registraPlaylist(String nome, String descrizione, String genere) {
        
        try {
            
            Connection connection = connect();
            
            PreparedStatement st = connection.prepareStatement("INSERT INTO playlist (nome, descrizione, genere, idutente)"
                                                               + "VALUES (?, ?, ?, ?)");
            
            st.setString(1, nome);
            st.setString(2, descrizione);
            st.setString(3, genere);
            st.setString(4, GlobalUserLogin.currentUsername);
            
            st.executeUpdate();
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserisciEmozioniBrano(String idutente, String idcanzone, int[] emotions_intensity) {
        
        String[] emotions = {"Calma", "Gioia", "Nostalgia", "Potere", "Solennità", "Stupore", "Tenerezza", "Tensione", "Tristezza"};
        
        try {
            
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            for (int i = 0; i < emotions.length; i++) {
                ResultSet rs = stmt.executeQuery("SELECT * FROM public.emozioni WHERE nome = '" + emotions[i] + "' AND idutente = '" + idutente + "'");
                
                if (!rs.isBeforeFirst()) {
                    if (emotions_intensity[i] != 0) {
                        PreparedStatement st = connection.prepareStatement("INSERT INTO public.emozioni (nome, valutazione, idcanzone, idutente) VALUES (?, ?, ?, ?)");

                        st.setString(1, emotions[i]);
                        st.setInt(2, emotions_intensity[i]);
                        st.setString(3, idcanzone);
                        st.setString(4, idutente);

                        st.executeUpdate();
                        st.close();
                    }
                } else {
                    if (emotions_intensity[i] != 0) {
                        PreparedStatement st = connection.prepareStatement("UPDATE public.emozioni SET valutazione = ? WHERE nome = ? AND idcanzone = ? AND idutente = ?");
                    
                        st.setInt(1, emotions_intensity[i]);
                        st.setString(2, emotions[i]);
                        st.setString(3, idcanzone);
                        st.setString(4, idutente);

                        st.executeUpdate();
                        st.close();
                    } else {
                        PreparedStatement st = connection.prepareStatement("DELETE FROM public.emozioni WHERE nome = ? AND idcanzone = ? AND idutente = ?");
                        
                        st.setString(1, emotions[i]);
                        st.setString(2, idcanzone);
                        st.setString(3, idutente);

                        st.executeUpdate();
                        st.close();
                    }
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo per registrare un cliente
     * @param nome        Nome del cliente da registrare
     * @param cognome     Cognome del cliente da registrare
     * @param CF          Codice fiscale del cliente da registrare
     * @param indirizzo   Indirizzo di residenza del cliente da registrare
     * @param email       E-mail del cliente da registrare
     * @param username    Nickname scelto del cliente da registrare
     * @param password    Password scelta del cliente da registrare
     */
    public void registrazione(String nome, String cognome, String CF, String indirizzo, String email, String username, String password) {
        
        try {
            
            Connection connection = connect();
            
            PreparedStatement st = connection.prepareStatement("INSERT INTO utentiregistrati (nome, cognome, CF, indirizzo, email, username, password)"
                                                               + "VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            st.setString(1, nome);
            st.setString(2, cognome);
            st.setString(3, CF);
            st.setString(4, indirizzo);
            st.setString(5, email);
            st.setString(6, username);
            st.setString(7, password);
            
            st.executeUpdate();
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public Boolean checkIfAlreadyRegistered(String column, String info) {
        
        Boolean checkIfAlreadyRegistered = false;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.utentiregistrati WHERE " + column + " = '" + info + "'");
            
            if (!rs.isBeforeFirst())
            {
                return checkIfAlreadyRegistered;
            }
            
            checkIfAlreadyRegistered = true;
            
            return checkIfAlreadyRegistered;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return checkIfAlreadyRegistered;
    }
    
    
    public Boolean checkIfUserIsRegistered(String username, String password) {
        
        Boolean checkIfUserIsRegistered = false;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.utentiregistrati WHERE username = '" + username + "' AND password = '" + password + "'");
            
            if (!rs.isBeforeFirst())
            {
                return checkIfUserIsRegistered;
            }
            
            checkIfUserIsRegistered = true;
            
            return checkIfUserIsRegistered;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return checkIfUserIsRegistered;
    }
    
    public ArrayList<Object[]> cercaBranoMusicaleDaAutoreAnno(String author, String year) {
        
        author = author.replace("'", "''");
        ArrayList<Object[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT Id, Anno, Autore, Titolo FROM public.canzoni WHERE LOWER(Autore) = LOWER('" + author + "') AND anno = '" + year + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
               Object[] song = new Object[4];
               
               song[0] = rs.getString("id");
               song[1] = rs.getString("titolo");
               song[2] = rs.getString("autore");
               song[3] = rs.getString("anno");
              
               results.add(song);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
    public ArrayList<Object[]> cercaBranoMusicaleDaTitolo(String title) {
        
        title = title.replace("'", "''");
        ArrayList<Object[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT Id, Anno, Autore, Titolo FROM public.canzoni WHERE LOWER(Titolo) LIKE LOWER('%" + title + "%')");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
               Object[] song = new Object[4];
               
               song[0] = rs.getString("id");
               song[1] = rs.getString("titolo");
               song[2] = rs.getString("autore");
               song[3] = rs.getString("anno");
              
               results.add(song);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
    public Song getSongsById(String id) {

        Song song = null;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.canzoni WHERE id = '" + id + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
                song = new Song(rs.getString("id"), rs.getString("titolo"), rs.getString("autore"), rs.getString("anno"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return song;
    }
    
    public ArrayList<Object[]> getUserPlaylists(String username) {
        
        ArrayList<Object[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.playlist WHERE idutente = '" + username + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
               Object[] playlist = new Object[5];
               
               playlist[0] = rs.getInt("id");
               playlist[1] = rs.getString("nome");
               playlist[2] = rs.getString("descrizione");
               playlist[3] = rs.getString("genere");
               playlist[4] = rs.getString("idutente");
              
               results.add(playlist);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }

    public ArrayList<Object[]> getSongsByPlaylist(int id) {

        ArrayList<String> idcanzoni = new ArrayList<>();
        ArrayList<Object[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT idcanzone FROM public.playlistassociate WHERE idplaylist = '" + id + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
                idcanzoni.add(rs.getString("idcanzone"));
            }
            
            for (String id_playlist : idcanzoni) {
                
                ResultSet rs_playlist = stmt.executeQuery("SELECT * FROM public.canzoni WHERE id = '" + id_playlist + "'");
                
                if (!rs_playlist.isBeforeFirst())
                {
                    return null;
                }

                while (rs_playlist.next()) {
                    Object[] song = new Object[4];
               
                    song[0] = rs_playlist.getString("id");
                    song[1] = rs_playlist.getString("titolo");
                    song[2] = rs_playlist.getString("autore");
                    song[3] = rs_playlist.getString("anno");

                    results.add(song);
                }
            }
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
    public void deletePlaylist(int id) {
        
        try
        {
            Connection connection = connect();
        
            PreparedStatement st = connection.prepareStatement("DELETE FROM public.playlist WHERE id = ?");
                        
            st.setInt(1, id);

            st.executeUpdate();
            st.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteSinglePlaylistSong(String idcanzone, int idplaylist) {
        
        try
        {
            Connection connection = connect();
        
            PreparedStatement st = connection.prepareStatement("DELETE FROM public.playlistassociate WHERE idcanzone = ? AND idplaylist = ?");
                        
            st.setString(1, idcanzone);
            st.setInt(2, idplaylist);

            st.executeUpdate();
            st.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> getAllUserPlaylist(String id) {
        
        ArrayList<String> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT nome FROM public.playlist WHERE idutente = '" + id + "'");

            if (!rs.isBeforeFirst())
            {
                return null;
            }

            while (rs.next()) {
                results.add(rs.getString("nome"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
     public Boolean checkIfSongInPlaylist(String idcanzone, int idplaylist) {
        
        Boolean checkIfSongInPlaylist = false;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.playlistassociate WHERE idcanzone = '" + idcanzone + "' AND idplaylist = " + idplaylist + "");
            
            if (!rs.isBeforeFirst())
            {
                return checkIfSongInPlaylist;
            }
            
            checkIfSongInPlaylist = true;
            
            return checkIfSongInPlaylist;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return checkIfSongInPlaylist;
    }
    
    public void insertSongInPlaylist(String idcanzone, int idplaylist) {
        
        try {
            Connection connection = connect();
            PreparedStatement st = connection.prepareStatement("INSERT INTO playlistassociate (idcanzone, idplaylist)"
                                                               + "VALUES (?, ?)");
            
            st.setString(1, idcanzone);
            st.setInt(2, idplaylist);
            
            st.executeUpdate();
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public int getPlaylistIdByName(String name) {
        
        int id = -1;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT id FROM public.playlist WHERE nome = '" + name + "'");

            if (!rs.isBeforeFirst())
            {
                return -1;
            }

            while (rs.next()) {
                id = rs.getInt("id");
            }  
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
    
    public Boolean checkIfPlaylistNameAlreadyExist(String name, String username) {
        
        Boolean checkIfAlreadyRegistered = false;
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.playlist WHERE nome = '" + name + "' AND idutente = '" + username + "'");
            
            if (!rs.isBeforeFirst())
            {
                return checkIfAlreadyRegistered;
            }
            
            checkIfAlreadyRegistered = true;
            
            return checkIfAlreadyRegistered;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return checkIfAlreadyRegistered;
    }
    
    public ArrayList<String> getAllUserInfo(String username) {

        ArrayList<String> results = new ArrayList<>();
        
        try
        {
            Connection connection = connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.utentiregistrati WHERE username = '" + username + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) {
               results.add(rs.getString("nome"));
               results.add(rs.getString("cognome"));
               results.add(rs.getString("cf"));
               results.add(rs.getString("indirizzo"));
               results.add(rs.getString("email"));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
    public static void setLogo(JFrame jframe) {
        ImageIcon img = new ImageIcon("C:\\Users\\andre\\Documents\\NetBeansProjects\\emotionalsongs\\src\\main\\java\\images/logo.png");
        jframe.setIconImage(img.getImage());
    }
    
}