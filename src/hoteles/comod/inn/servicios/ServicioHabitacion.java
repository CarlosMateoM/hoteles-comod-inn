
package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class ServicioHabitacion {
    
    private List<Habitacion> habitaciones;
    
    public ServicioHabitacion(){
        habitaciones = new ArrayList<>();
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public void registrar(Habitacion habitacion){
        habitaciones.add(habitacion);
    }
    
    
}
 