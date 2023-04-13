
package hoteles.comod.inn.modelos;

import hoteles.comod.inn.servicios.ServicioCliente;
import hoteles.comod.inn.servicios.ServicioHabitacion;


public class Hotel {
    
    private String pais;
    private String localizacion;
    private String nombre;
    private String categoria;
    private ServicioCliente servicioCliente;
    private ServicioHabitacion servicioHabitacion;
    

    public Hotel() {
        pais = "Colombia";
        nombre = "Hotel Caribe";
        categoria = "3 Estrellas";
        localizacion = "Cartagena, Bolívar";
        servicioCliente = new ServicioCliente();
        servicioHabitacion = new ServicioHabitacion();
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

    public ServicioCliente getServicioCliente() {
        return servicioCliente;
    }

    public ServicioHabitacion getServicioHabitacion() {
        return servicioHabitacion;
    }
    
    public void agregarProductoCuentaFrigoBar(Reserva reserva,
            Producto producto, int cantidad){
        
    }
    
}
