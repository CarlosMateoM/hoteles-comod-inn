package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Hotel;
import java.util.ArrayList;
import java.util.List;


public class ServicioHotel {
    
    private List<Hotel> hoteles;
    private static ServicioHotel instance;

    public ServicioHotel() {
        hoteles = new ArrayList<>();
        Hotel hotel = new Hotel();
        registrar(hotel);
    }
    
    public static ServicioHotel getInstance(){
        if(instance == null){
            instance = new ServicioHotel();
        }
        return instance;
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
