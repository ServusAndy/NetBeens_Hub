/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author andi
 */
public class Salary {

    public static void main(String[] args) {

        calcSalary(3333);

    }

    public static void calcSalary(double brutto) {
        double netto;
        if (brutto >= 0 && brutto < 2000) {
            netto = brutto;
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
        if (brutto >= 2000 && brutto < 4000) {
            netto = brutto - (brutto * 0.1);
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
        if (brutto >= 4000 && brutto < 6000) {
            netto = brutto - (brutto * 0.15);
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
        if (brutto >= 6000 && brutto < 8000) {
            netto = brutto - (brutto * 0.2);
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
        if (brutto >= 8000 && brutto < 10000) {
            netto = brutto - (brutto * 0.25);
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
        
        else if(brutto >= 10000)
        {
            netto = brutto - (brutto * 0.3);
            System.out.println("Netto: " + String.format("%.2f",netto));
        }
    }
}
