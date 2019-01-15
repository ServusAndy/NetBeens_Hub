/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswitch;

/**
 *
 * @author andi
 */
public class TestSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        calc(14, 2, "div");
    }
    
    public static void  calc(int a, int b,String oper){
        switch(oper){
            case "sum":
                System.out.println("a + b = " + (a+b));
                break;
            case "diff":
                System.out.println("a - b = " + (a-b));
                break;
            case "multi":
                System.out.println("a * b = " + a*b);
                break;
            case "div":
                System.out.println("a / b = " +(double)a/b);
                break;
            default:
                System.out.println("Input only sum,diff,multi or div operation!");
        
        }
    }
    
}
