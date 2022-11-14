import java.util.ArrayList;

public class MedioDeTransporte {
    private ArrayList<ObjetoTransportable>transportables;
    private double capacidadMaxima;
    private double capacidad;
    private  Dimension dimension;
    private int cantidadMaxima;


    public ArrayList<ObjetoTransportable> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<ObjetoTransportable> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }


    MedioDeTransporte(double capacidadMaxima,
                      Dimension dimension,
                      int cantidadMaxima
                      ){
       setTransportables(new ArrayList<ObjetoTransportable>());
       setCapacidad(0);
       setCantidadMaxima(cantidadMaxima);
       setCapacidadMaxima(capacidadMaxima);
       setDimension(dimension);
    }



}
