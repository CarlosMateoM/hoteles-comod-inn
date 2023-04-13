
package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Cuenta;


public class ServicioCuenta extends Servicio<Cuenta>{
    
    public ServicioCuenta() {
        super();
    }
    
    public void agregarDetalleCuenta(Cuenta cuenta){
        cuenta.setId(getIndice());
        getList().add(cuenta);
        incrementarIndice();
    }
    
    public Cuenta getCuentaById(int id) throws Exception{
        for(Cuenta cuenta: getList()){
            if(cuenta.getId() == id){
                return cuenta;
            }
        }
        throw new Exception("Cuenta no encontrada");
    }
    
}
