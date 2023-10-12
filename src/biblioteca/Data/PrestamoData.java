

package biblioteca.Data;

import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;



public class PrestamoData {
     private Connection con=null;
    
    public PrestamoData(){
        con=conexion.getConexion();
    }
    
    PreparedStatement ps;
    
    public void prestarEjemplar(Prestamo prestamo){
        
        String sql = "INSERT INTO prestamo(FechaInicio, FechaFin, idEjemplar, idLector, estado) "
                + "VALUES (?,?,?,?,?)";        
         try {
             ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setDate(1, java.sql.Date.valueOf(prestamo.getFechaInicio()));
             ps.setDate(2, java.sql.Date.valueOf(prestamo.getFechaFin()));
             ps.setInt(3,prestamo.getEjemplar().getIdEjemplar());
             ps.setInt(4,prestamo.getLector().getIdLector());
             ps.setBoolean(5,prestamo.isEstado());
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){
             prestamo.setIdPrestamo(rs.getInt(1));
             JOptionPane.showMessageDialog(null, "prestamo agregado con exito");
         }
   
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error" + ex);
         }
        
    }
}
