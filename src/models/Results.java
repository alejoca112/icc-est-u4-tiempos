package models;

public class Results {

    // CAMBIO 1: Ahora sampleSize es String para guardar el texto "Imprimir: 1000"
    private String sampleSize; 
    private String funtionName;
    private double timeResult;

    // CAMBIO 2: El constructor ahora recibe (Nombre, Tamaño, Tiempo) en ese orden
    // y acepta Strings en los dos primeros.
    public Results(String funtionName, String sampleSize, double timeResult) {
        this.funtionName = funtionName;
        this.sampleSize = sampleSize;
        this.timeResult = timeResult;
    }

    public String getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(String sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getFuntionName() {
        return funtionName;
    }

    public void setFuntionName(String funtionName) {
        this.funtionName = funtionName;
    }

    public double getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(double timeResult) {
        this.timeResult = timeResult;
    }

    @Override
    public String toString() {
        // Ajusté el toString para que se lea bien con los nuevos datos
        return "[ " + funtionName + ", " + sampleSize + ", Duración: " + timeResult + " segundos ]";
    }
}

