
package hoteles.comod.inn.modelos;

import java.util.List;


public class Hotel {
    
    private String pais;
    private String localizacion;
    private String nombre;
    private String categoria;
    private List<Cliente> clientes;
    private List<Reserva> reservas;
    private List<Huesped> habitaciones;

    public Hotel() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    public void agregarProductoCuentaFrigoBar(Reserva reserva, Producto producto, int cantidad){
        
    }
    
    /*
    public abstract calcularTotalNetoAPagar(Reserva reserva){
        
    }
    */
    
}
