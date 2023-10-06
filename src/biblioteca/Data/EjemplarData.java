
package biblioteca.Data;

import biblioteca.Entidades.Ejemplar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EjemplarData {
     private Connection con=null;
    
    public EjemplarData(){
        con=conexion.getConexion();
    }
    
      public void stock(){
        
    }
      
      PreparedStatement ps;
     public void guardarEjemplar (Ejemplar ejemplar){
                String sql = "INSERT INTO ejemplar (codigo,idLibro,estado)"
                + " VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ejemplar.getCodigo());
            ps.setInt(2, ejemplar.getLibro().getIdLibro()); 
            ps.setString (3, ejemplar.getEstado().toString()); /////////////////////// consulta tenemos problemas en el estado en la bd 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ejemplar.setIdEjemplar(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ejemplar agregado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un id correcto/diferente" + ex);
        } 
         
     }
     
     public void modificarEjemplar(Ejemplar ejemplar){  /// podemos usarlo como metodo de ELIMINAR modificando el estado
         String sql = "UPDATE ejemplar SET codigo=?, idLibro=?, estado=?"
                + "WHERE idEjemplar = ?";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ejemplar.getCodigo());
            ps.setInt(2, ejemplar.getLibro().getIdLibro());
            ps.setString(3, ejemplar.getEstado().toString());/////////////////////// consulta tenemos problemas en el estado en la bd 
            ps.setInt(4, ejemplar.getIdEjemplar());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ejemplar modificado con éxito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al intentar modificar el ejemplar");
        }
     }
     
     
     
}
