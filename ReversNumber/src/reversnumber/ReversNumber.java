/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversnumber;

/**
 *
 * @author andi
 */
public class ReversNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reversNumber(156));
    }
    
    public static int reversNumber(int num){
                int res=0;//6
                while(num!=0){
                res = res*10 + num%10;
                num = num/10;
                }
                return res;  
    }
    
}
