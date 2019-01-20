/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author andi
 */
public class SelectionSortApp {

    public static void main(String[] args) {
        
        int[] arr = {2,9,6,4,7,8,2,3,5,1};
        printArr(arr);
//        selectionSort(arr);
//        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
        
    }
    
    public static void selectionSort(int[] arr){
        int tmp;
        for(int i =0;i<arr.length;i++){
            int min = arr[i];
            int min_i = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]< min){
                    min = arr[j];
                    min_i = j;
                }
            
            }
            if(i != min_i){
                tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            for(int j = 0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    
    
    }
    
    public static void printArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }
    
}
