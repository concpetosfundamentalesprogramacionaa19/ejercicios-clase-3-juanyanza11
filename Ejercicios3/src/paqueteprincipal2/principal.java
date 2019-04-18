/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;
import paquetedatos.*; 
/**
 *
 * @author Usuario
 */
public class principal {
    
    public static void main(String[] args) {
        double resultado;
        double resultado2;
   
        resultado=variable.numero1+variable.numero2;
               
        System.out.printf("El resultado es:%.1f" ,resultado);
    
        resultado2=variable.numero1 + Variable2.numero3;
   
        System.out.printf("El resultado del número 1 y 3 es: %.1f",resultado);
    }
         
             
 }

