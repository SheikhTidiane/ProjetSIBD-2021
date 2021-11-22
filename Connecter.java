/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appligestionetablissemt;

import java.sql.*;

/**
 *
 * @author user
 */
public class Connecter {
    Connection con;
    public Connecter(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
        System.err.println(e);
    }
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gesetablissement", "root", "");
    }catch(SQLException e){System.err.println(e);}
        
    }
    Connection obtenirConnexion(){return con;}
    
}
