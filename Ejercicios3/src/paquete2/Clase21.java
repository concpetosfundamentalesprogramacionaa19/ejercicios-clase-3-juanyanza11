/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        
        bandera = valor1 < valor2;
        
        System.out.printf("%s\n", bandera);
        //resultado de bandera aplicando AND 
        bandera = (valor1 < valor2) & (valor1 > valor2); // Producto lógico – \AND (binario) V & F= F
        
        System.out.printf("%s\n", bandera);
        
        bandera = (valor1 < valor2) | (valor1 > valor2); // comparación con OR V o F= v
        
        System.out.printf("%s\n", bandera);
        
        bandera = !((valor1 < valor2) | (valor1 > valor2)); // Negación Y OR  Si el resultado es verdadero es falso- NOT (unario) 
        
        System.out.printf("%s\n", bandera);
    }
    
}
