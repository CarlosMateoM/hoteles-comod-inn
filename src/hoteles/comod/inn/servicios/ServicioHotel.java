package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Hotel;
import java.util.ArrayList;
import java.util.List;


public class ServicioHotel {
    
    private List<Hotel> hoteles;

    public ServicioHotel() {
        
        hoteles = new ArrayList<>();
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }
    
    public void registrar(Hotel hotel){
        hoteles.add(hotel);
    }
    
    
    
}
