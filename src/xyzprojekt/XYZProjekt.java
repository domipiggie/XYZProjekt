package xyzprojekt;

import java.util.Scanner;

public class XYZProjekt {
    
    public static double hengerTerfogat(double sugar, double magassag) {
        return Math.pow(sugar, 2) * Math.PI * magassag;
    }
    
    public static double hengerFelszin(double sugar, double magassag){
        return 2 * Math.pow(sugar,2) * Math.PI + 2 * sugar * Math.PI * magassag;
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
