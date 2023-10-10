

package biblioteca.Data;

import biblioteca.Entidades.Ejemplar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;



public class PrestamoData {
     private Connection con=null;
    
    public PrestamoData(){
        con=conexion.getConexion();
    }
    
    PreparedStatement ps;
    
    public void prestarEjemplar(Date FechaInicio,Date FechaFin,int idEjemplar,int idLector,boolean estado){
        
        String sql = "INSERT INTO `prestamo`(`FechaInicio`, `FechaFin`, `idEjemplar`, `idLector`, `estado`) "
                + "VALUES (?,?,?,?,?)";
        
         try {
             ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.set
         
         
         
         
         
         } catch (SQLException ex) {
             Logger.getLogger(PrestamoData.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
}
