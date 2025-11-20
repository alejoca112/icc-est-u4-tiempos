package controllers;

import java.util.Arrays;

public class SortMethods {
    public void sortBubble(int[] numeros){
        int[] cp = Arrays.copyOf(numeros, numeros.length);
        for (int i = 0; i < cp.length; i++) {
            for(int j = 0; j < cp.length - 1; j++){
                if(cp[j] > cp[j+1]){
                    int temp = cp[j];
                    cp[j] = cp[j+1];
                    cp[j+1] = temp;
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
    public void mergeSort(int[] numeros) {
        int[] cp = Arrays.copyOf(numeros, numeros.length);
        sort(cp, 0, cp.length - 1);
    }
    private void sort(int cp[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(cp, l, m);
            sort(cp, m + 1, r);
            merge(cp, l, m, r);
        }
    }
    private void merge(int cp[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = cp[l + i];
        for (int j = 0; j < n2; ++j) R[j] = cp[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                cp[k] = L[i];
                i++;
            } else {
                cp[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) { cp[k] = L[i]; i++; k++; }
        while (j < n2) { cp[k] = R[j]; j++; k++; }
    }
}
