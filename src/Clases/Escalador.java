
package Clases;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampaSoportada) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración Promedio: " + aceleracionPromedio);
        System.out.println("Grado de Rampa Soportada: " + gradoRampaSoportada);
    }
}
