
package hoteles.comod.inn.modelos;

import hoteles.comod.inn.enums.TiposHabitaciones;



public class Habitacion {
    
    private float precio;
    private TiposHabitaciones tipoHabitacion;

    public TiposHabitaciones getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TiposHabitaciones tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    private String descripcion;
    private int numeroHabitacion;
    private boolean disponibilidad;
    
    //private List<Huesped> huespedes;
    
    //private InventarioFrigoBar inventarioFrigoBar;

    public Habitacion() {
        numeroHabitacion = 0;
        disponibilidad = true;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /*
    public InventarioFrigoBar getInventarioFrigoBar() {
        return inventarioFrigoBar;
    }

    public void setInventarioFrigoBar(InventarioFrigoBar inventarioFrigoBar) {
        this.inventarioFrigoBar = inventarioFrigoBar;
    }*/
    
    
    
}
