
package biblioteca.Entidades;


public class Lector {
   public int idLector;
   public int nroSocio;
   public String nombreCompleto;
   public Object domicilio;
   public String mail;
   public boolean estado;

    public Lector() {
    }
    public Lector(int nroSocio, String nombreCompleto, Object domicilio, String mail, boolean estado) {
        this.nroSocio = nroSocio;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }
    public Lector(int idLector, int nroSocio, String nombreCompleto, Object domicilio, String mail, boolean estado) {
        this.idLector = idLector;
        this.nroSocio = nroSocio;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lector{" + "idLector=" + idLector + ", nroSocio=" + nroSocio + ", nombreCompleto=" + nombreCompleto + ", domicilio=" + domicilio + ", mail=" + mail + ", estado=" + estado + '}';
    }
   
  
}
