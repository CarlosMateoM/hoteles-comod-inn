
package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ServicioCliente extends Servicio<Cliente> {
    
    private int indice;
    private List<Cliente> clientes;

    public ServicioCliente() {
        indice = 1;
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void agregarCliente(Cliente cliente){
        cliente.setId(indice);
        clientes.add(cliente);
        indice++;
    }
    
    public Cliente getClienteByName(String name) throws Exception{
        for(Cliente cliente: clientes){
            if(cliente.getNombre().equals(name)){
                return cliente;
            }
        }
        throw new Exception("Cliente no encontrado");
    }
    
}
