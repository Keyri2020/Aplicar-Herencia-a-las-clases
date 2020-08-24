/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicarherenciaclases;

/**
 *
 * @author USUARIO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        profesor profe=new profesor("William", "chalate ", "25/5/1998", "m", 22 , " Ing ","Programador ");
        System.out.println(profe.toString());
    
     estudiante estu =new estudiante("Queiri", "Chalate", "12/4/2002", "f", 18, 100, "Ing. Sistemas y Computacion");
        System.out.println(estu.toString());
    }
    
}
