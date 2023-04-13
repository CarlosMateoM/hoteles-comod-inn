
package hoteles.comod.inn.servicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class Servicio<T> {
    
    private int indice;
    private List<T> list;
    
    public Servicio(){
        indice = 1;
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public void incrementarIndice(){
        indice = indice++;
    }
    
    
    
    
}
