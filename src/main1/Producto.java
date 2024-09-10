/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author Usuario
 */
public class Producto {
    
// Atributos privados
    private String nombre;
    private double precio;
    private int cantidad;
    
    // Constructor que inicializa todos los atributos
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
 // Getter para el nombre
    public String getNombre() {
        return nombre;
    }   
// Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter para el precio
    public double getPrecio() {
        return precio;
    }
    // Setter para el precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo. Manteniendo el precio anterior.");
        }
    }
     // Getter para la cantidad
    public int getCantidad() {
        return cantidad;
    }
      // Setter para la cantidad
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad no puede ser negativa. Manteniendo la cantidad anterior.");
        }
    }
}
