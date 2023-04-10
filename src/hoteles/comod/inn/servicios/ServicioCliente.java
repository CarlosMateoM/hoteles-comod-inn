
package hoteles.comod.inn.servicios;

import hoteles.comod.inn.modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ServicioCliente {
    
    private List<Cliente> clientes;

    public ServicioCliente() {
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
}
