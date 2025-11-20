import controllers.SortMethods;
import java.util.concurrent.Callable;
import models.BenchMarking;

import models.Results;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Geovanny Cabrera");
        /*long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            String s = "Numero: " + i;
            System.out.println(s);
        }

        long fin = System.nanoTime();
        System.out.println("Tiempo transcurrido: " + (fin - inicio) + " nanosegundos");
        System.out.println("Tiempo transcurrido en segundos: " + (fin-inicio)/1_000_000_000.0 );
        Results result = new Results(1, "Imprimir 100000", (fin - inicio)/1_000_000_000.0);
        System.out.println(result);
        /* */
        Callable<Void> funCallable = () -> {
            funcion1();
            return null;
        };

        //Results r = BenchMarking.medir_tiempo(funCallable1, size, "Metodo Burbuja");
        //System.out.println(r);
       
        //SampleSize = cuantas veces hay un for,
        //long inicio_millis = System.currentTimeMillis(); (Millisegundos)
        /*long inicio_millis = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String s = "Numero: " + i;
            System.out.println(s);
        }

        long fin_millis = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: " + (fin_millis - inicio_millis) + " nanosegundos");
        /* */
        int[] originalArray = generate(250000);

        int[] array1000 = new int[1000];
        System.arraycopy(originalArray, 0, array1000, 0, 1000);

        int[] array5000 = new int[5000];
        System.arraycopy(originalArray, 0, array5000, 0, 5000);

        int[] array10000 = new int[10000];
        System.arraycopy(originalArray, 0, array10000, 0, 10000);

        int[] array100000 = new int[100000];
        System.arraycopy(originalArray, 0, array100000, 0, 100000);

        int[] array200000 = new int[200000];
        System.arraycopy(originalArray, 0, array200000, 0, 200000);


        int[][] arrays = {array1000, array5000, array10000, array100000, array200000, originalArray};
        SortMethods sorter = new SortMethods();
        for(int[] array : arrays){
            int size = array.length;
            Callable<Void> funCallable1 = () -> {
                sorter.sortBubble(array);
                return null;
            };
            Results result = BenchMarking.medir_tiempo("Metodo Burbuja: ", funCallable1, size);
            System.out.println(result);
            
        }

        for(int[] array : arrays){
        int size = array.length;
        Callable<Void> funCallable1 = () -> {
            sorter.sortBubbleM(array);
            return null;
        };
        Results result = BenchMarking.medir_tiempo("Metodo Bubble Sort Avanzado: ",funCallable1, size);
        System.out.println(result);    
        }

        for(int[] array : arrays){
        int size = array.length;
        Callable<Void> funCallable1 = () -> {
            sorter.shellSort(array);
            return null;
        };
        Results result = BenchMarking.medir_tiempo("Metodo Shell Sort",funCallable1, size);
        System.out.println(result);    
        }
        
        for(int[] array : arrays){
        int size = array.length;
        Callable<Void> funCallable1 = () -> {
            sorter.mergeSort(array);
            return null;
        };
        Results result = BenchMarking.medir_tiempo("Merge Sort",funCallable1, size);
        System.out.println(result);    
        }
    }

    public static void funcion1(){
        for (int i = 0; i < 100000; i++) {
            String s = "Numero: " + i;
            System.out.println(s);
        }
    }
    //Metodo mide el tiempo
    /*public static Results medir_tiempo(Callable func){
        try {
            long inicio = System.nanoTime();
            func.call();
            long fin = System.nanoTime();
            Results result = new Results(1, "Imprimir 100000 numeros", (fin-inicio) / 1_000_000_000);
            return result;
        } catch(Exception e) {
            throw  new RuntimeException("Error midiendo tiempo", e);
        }
    } /* */

    public static int[] generate(int size){
        int[] numeros = new int[size];
        for(int i = 0; i < size; i++){
            numeros[i] = (int) (Math.random()*10000); 
        }
        return numeros;
    }
}
