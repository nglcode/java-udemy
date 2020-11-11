/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author agdev
 */
public class TestOperaciones {
    
    public static void main(String[] args) {
        
        
        int r1 = Operaciones.sumar(2, 3);
        double r2 = Operaciones.sumar(2.5, 1.6);
        
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        
    }
    
}
