
package hoteles.comod.inn.modelos;

import java.time.LocalDate;
import java.util.List;


public class Reserva {
    
    private int id;
    private int numeroHabitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private List<Huesped> huespedes;
   // private CuentaFrigoBar cuentafrigobar;

    public Reserva(int id, int numeroHabitacion, LocalDate fechaIngreso, LocalDate fechaSalida, List<Huesped> huespedes
//            ,  CuentaFrigoBar cuentafrigobar
    ) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.huespedes = huespedes;
     //   this.cuentafrigobar = cuentafrigobar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    /*
    public CuentaFrigoBar getCuentafrigobar() {
        return cuentafrigobar;
    }

    public void setCuentafrigobar(CuentaFrigoBar cuentafrigobar) {
        this.cuentafrigobar = cuentafrigobar;
    }
    */
    
    
}
