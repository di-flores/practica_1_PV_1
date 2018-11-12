/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB5-PC8-USUARIO
 */ 
public class fibonacci {
 
    /**
     * @param args the comand line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=1, n2=1, n3, c;
        c= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos: "));
        System.out.println(n1+" "+n2+" ");
        for(int i=1; i<=c-2;i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
        System.out.println();
 
    }
 
}