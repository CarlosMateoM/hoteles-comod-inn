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
public class Huesped {
    private int identificacion;
    private LocalDate fechadeNacimiento;
    private String nacionalidad;

    public Huesped(int identificacion, LocalDate fechadeNacimiento, String nacionalidad) {
        this.identificacion = identificacion;
        this.fechadeNacimiento = fechadeNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    
    
}
