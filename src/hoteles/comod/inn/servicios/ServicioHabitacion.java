
package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class ServicioHabitacion {
    
    private int indice;
    private List<Habitacion> habitaciones;
    
    public ServicioHabitacion(){
        indice = 1;
        habitaciones = new ArrayList<>();
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public void registrar(Habitacion habitacion){
        habitacion.setNumeroHabitacion(indice);
        habitacion.setDisponible(true);
        habitaciones.add(habitacion);
        indice++;
    }
    
    public Habitacion buscar(int numeroHabitacion) throws Exception{
        for(Habitacion habitacion: habitaciones){
            if(habitacion.getNumeroHabitacion() == numeroHabitacion){
                return habitacion;
            }
        }
        throw new Exception("Habitacion no encontrada");
    }
    
    public void cambiarDisponibilidadHabitacion(int numeroHabitacion, boolean isDisponible){
        for(Habitacion habitacion: habitaciones){
            if(habitacion.getNumeroHabitacion() == numeroHabitacion){
                habitacion.setDisponible(isDisponible);
                break;
            }
        }
    }
    
    
}
 