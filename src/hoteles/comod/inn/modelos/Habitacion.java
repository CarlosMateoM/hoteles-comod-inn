
package hoteles.comod.inn.modelos;

import hoteles.comod.inn.enums.TiposHabitaciones;
import java.util.ArrayList;
import java.util.List;



public class Habitacion {
    
    private float precio;
    private TiposHabitaciones tipoHabitacion;

    private String descripcion;
    private int numeroHabitacion;
    private boolean disponible;
    
   private List<Huesped> huespedes;
    
    //private InventarioFrigoBar inventarioFrigoBar;
    public TiposHabitaciones getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TiposHabitaciones tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion() {
        numeroHabitacion = 0;
        disponible = true;
        huespedes = new ArrayList<Huesped>();
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }
    
    
    
    public void agregarHuesped(Huesped huesped){
        huespedes.add(huesped);
    }

    /*
    public InventarioFrigoBar getInventarioFrigoBar() {
        return inventarioFrigoBar;
    }

    public void setInventarioFrigoBar(InventarioFrigoBar inventarioFrigoBar) {
        this.inventarioFrigoBar = inventarioFrigoBar;
    }*/
    
    
    
}
