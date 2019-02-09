/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrtesting;

/**
 *
 * @author andi
 */
public class ArrTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr= {1,3,4,6,7,8,9,4,5,6};
        int sum = sumArr(arr);
        System.out.println(sum);
        printOdd(arr);
        
    }

    private static int sumArr(int[] arr) {
        int res = 0;
        for(Integer i:arr){
              res+=i;
        }
         return res;
    }

    private static void printOdd(int[] arr) {
        for(Integer i : arr){
            if(i%2==0){
                System.out.print(" " + i + " ");
            }
        }
    }
    
}
