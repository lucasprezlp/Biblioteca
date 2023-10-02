
package biblioteca.Entidades;

public class Libro {
    public int idLibro;
   public int isbn;
   public String titulo;
   public Autor autor;
   public int anio;
   public String tipo;
   public String Editor;
   public boolean estado;
   public int numEjemplares;

    public Libro() {
    }

    public Libro(int idLibro, int isbn, String titulo, Autor autor, int anio, String tipo, String Editor, boolean estado, int numEjemplares) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.Editor = Editor;
        this.estado = estado;
        this.numEjemplares = numEjemplares;
    }

    public Libro(int isbn, String titulo, Autor autor, int anio, String tipo, String Editor, boolean estado, int numEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.Editor = Editor;
        this.estado = estado;
        this.numEjemplares = numEjemplares;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String Editor) {
        this.Editor = Editor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }


   
   
   
}
