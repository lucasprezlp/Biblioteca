
package biblioteca.Entidades;

import java.util.Date;


public class Prestamo {
    public int idPrestamo;
    public Date FechaInicio;
    public Date FechaFin;
    public Ejemplar Ejemplar;
    public Lector lector;
    public boolean estado;

    public Prestamo() {
    }
    public Prestamo(Date FechaInicio, Date FechaFin, Ejemplar Ejemplar, Lector lector, boolean estado) {
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Ejemplar = Ejemplar;
        this.lector = lector;
        this.estado = estado;
    }
    public Prestamo(int idPrestamo, Date FechaInicio, Date FechaFin, Ejemplar Ejemplar, Lector lector, boolean estado) {
        this.idPrestamo = idPrestamo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Ejemplar = Ejemplar;
        this.lector = lector;
        this.estado = estado;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public Date getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    public Date getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    public Ejemplar getEjemplar() {
        return Ejemplar;
    }
    public void setEjemplar(Ejemplar Ejemplar) {
        this.Ejemplar = Ejemplar;
    }
    public Lector getLector() {
        return lector;
    }
    public void setLector(Lector lector) {
        this.lector = lector;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", Ejemplar=" + Ejemplar + ", lector=" + lector + ", estado=" + estado + '}';
    }
    
    
    
}
