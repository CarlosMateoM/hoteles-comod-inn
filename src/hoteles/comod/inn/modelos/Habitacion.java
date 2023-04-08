
package hoteles.comod.inn.modelos;

import java.util.List;

/**
 *
 * 
 */
public class Habitacion {
    
    private int numeroHabitacion;
    private boolean disponibilidad;
    private List<Huesped> huespedes;
    private String tipoHabitacion;
    //private InventarioFrigoBar inventarioFrigoBar;

    public Habitacion(int numeroHabitacion, boolean disponibilidad, List<Huesped> huespedes, String tipoHabitacion
            //, InventarioFrigoBar inventarioFrigoBar
    ) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponibilidad = disponibilidad;
        this.huespedes = huespedes;
        this.tipoHabitacion = tipoHabitacion;
    //    this.inventarioFrigoBar = inventarioFrigoBar;
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

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    /*
    public InventarioFrigoBar getInventarioFrigoBar() {
        return inventarioFrigoBar;
    }

    public void setInventarioFrigoBar(InventarioFrigoBar inventarioFrigoBar) {
        this.inventarioFrigoBar = inventarioFrigoBar;
    }*/
    
    
    
}
