
package Clases;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadMaxima;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadMaxima) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }
}
