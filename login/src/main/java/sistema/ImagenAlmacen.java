
package sistema;


public class ImagenAlmacen {
    private int imagen_id;
    private String titulo;
    private String descripcion;
    private Double precio;
    private byte [] imagen;
    
    
    public int getImagen_id() {
        return imagen_id;
       
    }
    
    public void setImagen_id(int imagen_id) {
        this.imagen_id=imagen_id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        public Double getPrecio() {
        return precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public byte[] getImagen() {
        return imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen= imagen;
    }
}
