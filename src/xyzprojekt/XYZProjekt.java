/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xyzprojekt;

import java.util.Scanner;

/**
 *
 * @author veejuu
 */
public class XYZProjekt {
    public static double hengerTerfogat(double sugar, double magassag) {
        return Math.pow(sugar, 2) * Math.PI * magassag;
    }
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Írja be a sugarat: ");
        double sugar = bill.nextDouble();
        System.out.println("Írja be a magasságot: ");
        double magassag = bill.nextDouble();
        
        System.out.println(hengerFelszin(sugar, magassag));
        System.out.println(hengerTerfogat(sugar, magassag));
    }
    
}
