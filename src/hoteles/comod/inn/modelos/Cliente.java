package hoteles.comod.inn.modelos;

import hoteles.comod.inn.servicios.ServicioCuenta;


public class Cliente {

    private int id;
    private String nombre;
    private String telefono;
    private ServicioCuenta servicioCuenta;
    
    public Cliente() {
        id = 0;
        nombre = "name";
        telefono = "3022942391";
        servicioCuenta = new ServicioCuenta();
    }
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServicioCuenta getServicioCuenta() {
        return servicioCuenta;
    }
}
