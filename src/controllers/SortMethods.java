package controllers;

import java.util.Arrays;

public class SortMethods {
    public void sortBubble(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] > numeros[j]){
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }

    public void sortBubbleM(int[] numeros){
        int[] cp = Arrays.copyOf(numeros, numeros.length);
        for(int i = 0; i < cp.length; i++){
            boolean swapped = false;
            for(int j = 0; j < cp.length - 1 -i; j++){
                if(cp[j] > cp[j+1]){
                    int temp = cp[j];
                    cp[j] = cp[j+1];
                    cp[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public void shellSort(int[] numeros) {
    int[] cp = Arrays.copyOf(numeros, numeros.length);    
    for (int gap = cp.length / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < cp.length; i++) {
            int key = cp[i];
            int j = i;
            while (j >= gap && cp[j - gap] > key) {
                cp[j] = cp[j - gap];
                j -= gap;
                }   
            cp[j] = key;
            }
        }
    }

    public void mergeSort(int[] numeros){
    int[] cp = Arrays.copyOf(numeros, numeros.length);
    
    }
}
