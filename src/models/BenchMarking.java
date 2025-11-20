package models;

import java.util.concurrent.Callable;

public class BenchMarking {
    //Metodo mide el tiempo
    public static Results medir_tiempo(String funtionName, Callable func, int size){
        try {
            long inicio = System.nanoTime();
            func.call();
            long fin = System.nanoTime();
            Results result = new Results("El metodo funtion name: " + funtionName, "Imprimir: " + size, (fin-inicio) / 1_000_000_000.0);
            return result;
        } catch(Exception e) {
            throw  new RuntimeException("Error midiendo tiempo", e);
        }
    }
}
