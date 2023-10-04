/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Data;

import java.sql.Connection;

/**
 *
 * @author lucas
 */
public class ejemplarData {
     private Connection con=null;
    
    public ejemplarData(){
        con=conexion.getConexion();
    }
    
      public void stock(){
        
    }
}
