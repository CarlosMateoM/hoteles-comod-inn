
package hoteles.comod.inn.modelos;


public class Huesped extends Cliente{
    
    private int numeroHabitacion;

    public Huesped() {
        super();
    }

    public Huesped(String nombre, String telefono, int numeroHabitacion) {
        super(nombre, telefono);
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
 
}
