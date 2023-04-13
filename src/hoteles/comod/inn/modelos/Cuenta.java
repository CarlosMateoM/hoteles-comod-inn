
package hoteles.comod.inn.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    
    private int id;
    private boolean pagada;
    private LocalDate fechaCreacion;
    private List<DetalleCuenta> detallesCuenta;
    
    public Cuenta(){
        id = 0;
        pagada = false;
        fechaCreacion = LocalDate.now();
        detallesCuenta = new ArrayList<>();
    }

    public List<DetalleCuenta> getDetallesCuenta() {
        return detallesCuenta;
    }

    public void setDetallesCuenta(List<DetalleCuenta> detallesCuenta) {
        this.detallesCuenta = detallesCuenta;
    }
    
    public void registrar(DetalleCuenta detalleCuenta){
        detallesCuenta.add(detalleCuenta);
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public double getTotalCuenta(){
        double total = 0;
        for(DetalleCuenta detalleCuenta: detallesCuenta) {
            total += detalleCuenta.getValor();
        }
        return total;
    }
    
    
}
