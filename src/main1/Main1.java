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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear una instancia de Producto
        Producto producto = new Producto("Laptop", 999.99, 10);
        
        // Mostrar los valores iniciales de los atributos
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        
        // Modificar los valores utilizando los setters
        producto.setNombre("Laptop Gaming");
        producto.setPrecio(1199.99);
        producto.setCantidad(5);
        
         // Mostrar los nuevos valores
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        
              // Intentar establecer un precio y una cantidad negativos
        producto.setPrecio(500.00); // Debería mostrar un mensaje de error y mantener el precio anterior
        producto.setCantidad(3); // Debería mostrar un mensaje de error y mantener la cantidad anterior
        
         // Mostrar los valores después de intentar establecer valores negativos
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
    }

}
    

