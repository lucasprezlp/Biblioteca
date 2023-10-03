
package biblioteca.Data;

import biblioteca.Entidades.Lector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LectorData {
    private Connection con=null;
    
    public LectorData(){
        con=conexion.getConexion();
    }
    
    
    
    public void activarLector(int idLector){
        String sql = "UPDATE lector SET estado = 1 WHERE idLector=?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se activo el lector");
            }
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la BD lector");        }
        
    }
    
       public void desactivarLector(int idLector){
        String sql = "UPDATE lector SET estado = 0 WHERE idLector=?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se DESactivo el lector");
            }
   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la BD lector");        }
        
    } 
    
    
    
}
