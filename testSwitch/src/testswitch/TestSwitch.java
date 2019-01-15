/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author andi
 */
public class TestSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      /*  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        String op = br.readLine();
        calc(x, y, op);
        */
      
        calc(inputNumber(), inputNumber(), inputOper());
        
        
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
    
    public static void calculete() throws IOException{
     String oper="";
        int a=0;
        int b=0;
        while(true){
            System.out.println("input first number");
        a = inputNumber();
        break;
        }
        while(true){
            System.out.println("input second number");
        b = inputNumber();
        break;
        }
        while(true){
            
        oper = inputOper();
        }
    }
    
  
    
    
    public static int inputNumber() throws IOException{
     return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
    }
    
    public static String inputOper() throws IOException{
        return new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
    }
    
}
