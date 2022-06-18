package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;

public class Utilities {
    
    // credenziali final per l'accesso al DB
    private final String url = "jdbc:postgresql://localhost:8996/postgres";
    private final String user = "postgres";
    private final String password = "admin";
    
    // permette la connessione al database
    public Connection Connect() {
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection; 
    }
    
    public void cercaBranoMusicale() {
        
    }
    
    public void visualizzaEmozioneBrano() {
        
    }
    
    public void RegistraPlaylist() {
        
    }
    
    public void inserisciEmozioniBrano() {
        
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
    public void Registrazione(String nome, String cognome, String CF, String indirizzo, String email, String username, String password) {
        
        try {
            
            Connection connection = Connect();
            
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
    
    
    public Boolean CheckIfAlreadyRegistered(String column, String info) {
        
        Boolean checkIfAlreadyRegistered = false;
        
        try
        {
            Connection connection = Connect();
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
    
    
    public Boolean CheckIfUserIsRegistered(String username, String password) {
        
        Boolean checkIfUserIsRegistered = false;
        
        try
        {
            Connection connection = Connect();
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
    
    public ArrayList<Object[]> GetSongsByAuthorsAndYears(String author, String year) {
        
        ArrayList<Object[]> results = new ArrayList<>();
        
        try
        {
            Connection connection = Connect();
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT Anno, Autore, Titolo FROM public.canzoni WHERE autore = '" + author + "' AND anno = '" + year + "'");
            
            if (!rs.isBeforeFirst())
            {
                return null;
            }
            
            while (rs.next()) 
            {
               Object[] song = new Object[3];
               
               song[0] = rs.getString("titolo");
               song[1] = rs.getString("autore");
               song[2] = rs.getInt("anno");
              
               results.add(song);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results;
    }
    
}