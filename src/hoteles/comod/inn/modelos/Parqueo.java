/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteles.comod.inn.modelos;

import java.time.LocalDate;

/**
 *
 * @author victor
 */
public class Parqueo {
    
    private int id;
    private Vehiculos vehiculos;
    private Huesped huesped;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    public Parqueo(int id, Vehiculos vehiculos, Huesped huesped, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.id = id;
        this.vehiculos = vehiculos;
        this.huesped = huesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
